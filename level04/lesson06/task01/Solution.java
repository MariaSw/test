package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int a = Integer.parseInt(name);

        String name1 = reader.readLine();
        int b = Integer.parseInt(name1);

        if (a>b)
            System.out.println(b);
        else
            System.out.println(a);//напишите тут ваш код

    }
}