package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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

        String name2 = reader.readLine();
        int c = Integer.parseInt(name2);

        String name3 = reader.readLine();
        int d = Integer.parseInt(name3);

        if (a>b&&a>c&&a>d)
            System.out.println(a);
        else if (b>c&&b>d&&b>a)
            System.out.println(b);
        else if (c>a&&c>b&&c>d)
        System.out.println(c);
        else if (d>b&&d>c&&d>a)
            System.out.println(d);//напишите тут ваш код

    }
}
