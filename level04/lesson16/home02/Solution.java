package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import static java.lang.Math.max;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        String i = reader.readLine();
        int b = Integer.parseInt(i);

        String l = reader.readLine();
        int c = Integer.parseInt(l);

        int r = max(max(a,b),c);
        if (r==a)
            System.out.println(max(b,c));
        else if (r==b)
            System.out.println(max(a,c));
        else
            System.out.println(max(a,b));


        //напишите тут ваш код
    }
}
