package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int rectangle1;
    private int rectangle2;


    public int getRectangle2() {
        return rectangle2;
    }

    private int width, height;
    public void initialize(int left, int top,int width, int height){
        this.rectangle1 = left+top+width+height;
    }
    public void initialize(int left, int top){
        this.rectangle1 = left+top+this.width+this.height;
    }
    public void initialize(int left, int top,int width) {
        this.height = width;
        this.rectangle1 = left + top + width + this.height;
    }
    public void initialize(Rectangle rectangle2){
        this.rectangle1 = rectangle2.getRectangle2();
    }

    //напишите тут ваш код

}