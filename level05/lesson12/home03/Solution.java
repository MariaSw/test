package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat("Tom", 5,"grey");
        Dog bigDog = new Dog("Many", 8, 10);
        Dog littleDog = new Dog("Eddy", 4, 5);
        Cat littleCat = new Cat("Tommy", 3,"black");
        Mouse jellyMouse = new Mouse("Judy", 10, 8);

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat{
        String name;
        int speed;
        String color;

        public Cat(String name, int speed, String color){
            this.name = name;
            this.speed = speed;
            this.color = color;
        }
    }
    public static class Dog {
        String name;
        int strength;
        int intelligence;

        public Dog(String name, int strength, int intelligence){
            this.name = name;
            this.strength = strength;
            this.intelligence = intelligence;
        }
    }//добавьте тут ваши классы

}
