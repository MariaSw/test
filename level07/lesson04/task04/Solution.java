package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i<numbers.length;i++)
            numbers[i] = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i<numbers.length/2;i++) {
            int c = numbers[i];
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = c;

        }


        for (int i = 0; i<numbers.length;i++)
            System.out.println(numbers[i]);
        //напишите тут ваш к
    }
}
