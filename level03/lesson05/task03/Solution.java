package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds(int hour)
    {
      hour*=3600;
        return hour;
    }//напишите тут ваш код

    public static void main(String[] args) {
        int i = convertToSeconds(2);
        System.out.println(i);
        int b = convertToSeconds(4);
        System.out.println(b);//напишите тут ваш код
    }
}