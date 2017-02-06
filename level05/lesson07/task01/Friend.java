package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friend1 = null;
    public void initialize(String name){
        this.friend1 = name;
    }
    public void initialize(String name, int age){
        this.friend1 = name+age;
    }

    public void initialize (String name, int age, char gender){
        this.friend1 = name+age+gender;
    }
    //напишите тут ваш код
}
