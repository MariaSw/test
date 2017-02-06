package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dogname = null;
    private int height;
    private String color = null;

    public Dog (String name){
        this.dogname = name;
    }
    public Dog (String name, int height){
        this.dogname = name;
        this.height = height;
    }

    public Dog(String name,int height, String color){
        this.dogname = name;
        this.height = height;
        this.color = color;
    }
    //напишите тут ваш код

}
