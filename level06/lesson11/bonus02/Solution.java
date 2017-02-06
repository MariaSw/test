package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFaName = reader.readLine();
        Cat grandFa = new Cat(grandFaName);

        String grandMaName = reader.readLine();
        Cat grandMa = new Cat(grandMaName);

        String DadName = reader.readLine();
        Cat Dad = new Cat(DadName, grandFa,null);

        String MomName = reader.readLine();
        Cat Mom = new Cat(MomName, null,grandMa);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName,Dad, Mom);

        String dotName = reader.readLine();
        Cat dot = new Cat(dotName, Dad, Mom);

        System.out.println(grandFa);
        System.out.println(grandMa);
        System.out.println(Dad);
        System.out.println(Mom);
        System.out.println(son);
        System.out.println(dot);
    }

    public static class Cat
    {
        private String name=null;
        private Cat parentDad=null;
        private Cat parentMom=null;

        Cat (String name){
            this.name=name;
        }
        Cat(String name, Cat parentDad, Cat parentMom){
            this.name = name;
            this.parentDad = parentDad;
            this.parentMom = parentMom;
        }

        @Override
        public String toString()
        {
            if (parentMom == null) {
                if (parentDad == null)
                    return "Cat name is " + name + ", no mother, no father";
                else
                    return "Cat name is " + name + ", no mother, father is " + parentDad.name;
            }
            else
                if (parentDad == null)
                    return "Cat name is " + name + ", mother is " + parentMom.name + ", no father";
                else
                    return "Cat name is " + name + ", mother is " + parentMom.name+", father is " + parentDad.name;
            }
        }

    }



