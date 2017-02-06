package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args){

        Human Vit = new Human("Витя", true, 29, new ArrayList<Human>(), null, null, null);
        Human Lena = new Human("Лена", false, 28, new ArrayList<Human>(), null, null, null);
        Human Masha = new Human("Маша", false, 22, new ArrayList<Human>(), null, null, null);
        Human M = new Human("Вера", false, 57, new ArrayList<Human>(), Masha, Lena, Vit);
        Human f = new Human("Ярослав", true, 59, new ArrayList<Human>(), Masha, Lena, Vit);
        Human GFaM = new Human("Федя",true, 80, new ArrayList<Human>(), M, null, null);
        Human GMaM = new Human("Зина",false, 79, new ArrayList<Human>(), M, null, null);
        Human GFaf = new Human("Дима",true, 75, new ArrayList<Human>(), f, null, null);
        Human GMaf = new Human("Лена",false, 75, new ArrayList<Human>(), f, null, null);

        System.out.println(GMaf);
        System.out.println(GFaf);
        System.out.println(GMaM);
        System.out.println(GFaM);
        System.out.println(f);
        System.out.println(M);
        System.out.println(Masha);
        System.out.println(Lena);
        System.out.println(Vit);

    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        ArrayList<Human> children;


        Human(String name, Boolean sex, int age, ArrayList<Human> children, Human child1, Human child2, Human child3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            if (child1!=null) children.add(child1);
            if (child2!=null)children.add(child2);
            if (child3!=null)children.add(child3);
        }
    //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
