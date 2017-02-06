package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(WordsToUpperCase(s));
    }

    public static String WordsToUpperCase(String s){
        char[] array = s.toCharArray();
       if (array[0]!=' ') array[0]=Character.toUpperCase(array[0]);
       for (int i = 0; i < array.length-1; i++) {
           if (array[i] == ' ') {
               array[i + 1] = Character.toUpperCase(array[i + 1]);
           }
       }
       String result ="";
       for (int j = 0; j < array.length; j++) {
                result+=array[j];
            }
        return result;
       /*List <String> list = new ArrayList<>();
        for (String f : s.split(" "))
            list.add(f);


        for (String d : list) {
             Character.toUpperCase(d.charAt(0));
            System.out.println(d);*/
}
}
