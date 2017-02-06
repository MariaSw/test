package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dog1 = null;

    public void initialize(String name){
        dog1 = name;
    }

    public void initialize(String name, int height){
        dog1 = name + height;
    }

    public void initialize(String name, int height, String color){
        dog1 = name + height + color;
    }//напишите тут ваш код

}
