package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        /*com.javarush.test.level05.lesson05.task01.Cat cat1 = new Cat();
        com.javarush.test.level05.lesson05.task01.Cat cat2 = new Cat();
        com.javarush.test.level05.lesson05.task01.Cat cat3 = new Cat();
        cat1.name = "Barsik";
        cat1.age = 2;
        cat1.weight = 5;
        cat1.strength = 3;

        cat2.name = "Vaska";
        cat2.age = 4;
        cat2.weight = 8;
        cat2.strength = 6;

        cat3.name = "Glen";
        cat3.age = 8;
        cat3.weight = 16;
        cat3.strength = 12;*/
        //долго и неправильно! Лучше использовать конструктор. Так все в одной строчке.
        //Плюс так можно достутучаться к private полям

        Cat cat1 = new Cat("Barsik", 2,5,3);
        Cat cat2 = new Cat("Vaska", 4,8,6);
        Cat cat3 = new Cat("Glen", 8,16,12);
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
