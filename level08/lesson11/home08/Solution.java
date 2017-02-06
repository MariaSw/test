package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        /*for (int i = 0; i >array.length-1; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j]>array[j-1]){
                    int c = array[j];
                    array[j] = array[j-1];
                    array[j-1] = c;
                }
            }
        }*/
        int max;
        int temp;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                max=array[j];
                if (max<array[i]){
                    temp = max;
                    max=array[i];
                    array[i]=temp;
                }
                array[j]=max;
            }

        }
    }//напишите тут ваш код
}