package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String KolLet = reader.readLine();
        int KolLetNumber = Integer.parseInt(KolLet);

        String myName = reader.readLine();

        System.out.println(myName+" захватит мир через "+KolLetNumber+" лет. Му-ха-ха!");
        //напишите тут ваш код

    }
}