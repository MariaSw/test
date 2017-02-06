package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grFaF = new Human("Дима", true, 80,null,null);
        Human grMaF = new Human("Лена", false, 80,null,null);
        Human grFaM = new Human("Федя", true, 70,null,null);
        Human grMaM = new Human("Зина", false, 70,null,null);
        Human Fa = new Human("Ярослав", true,59,grFaF,grMaF);
        Human Ma = new Human("Вера", false,56,grFaM,grMaM);
        Human Masha1 = new Human("Маша", false, 22,Fa,Ma);
        Human Lena2 = new Human("Лена", false, 29,Fa,Ma);
        Human Misha3 = new Human("Миша", true, 18,Fa,Ma);

        System.out.println(grFaF);
        System.out.println(grMaF);
        System.out.println(grFaM);
        System.out.println(grMaM);
        System.out.println(Fa);
        System.out.println(Ma);
        System.out.println(Masha1);
        System.out.println(Lena2);
        System.out.println(Misha3);
        //напишите тут ваш код
    }

    public static class Human
    {

            private String name;
            private boolean sex;
            private int age;
            private Human father;
            private Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
