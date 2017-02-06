package com.javarush.test.level08.lesson08.task01;


import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static void main(String[] args){

        Set<String> lset = createSet();
        for(String s:lset)
        System.out.println(s);
    }


    public static HashSet<String> createSet()
    {
        HashSet <String> lset = new HashSet<String>();
        String s = "л";
        for (int i = 0; i < 20; i++) {
            lset.add(s);
            s = s+"о";
        }
        return lset;//напишите тут ваш код

    }
}
