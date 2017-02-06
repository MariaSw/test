package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GetMonthNumber(reader.readLine());
    }

    public static void GetMonthNumber(String s) {
        Set<String> month = new HashSet<>();
        month.add("January is 1 month");
        month.add("February is 2 month");
        month.add("March is 3 month");
        month.add("April is 4 month");
        month.add("May is 5 month");
        month.add("June is 6 month");
        month.add("July is 7 month");
        month.add("August is 8 month");
        month.add("September is 9 month");
        month.add("October is 10 month");
        month.add("November is 11 month");
        month.add("December is 12 month");

        for (String d : month) {
            if (d.contains(s) || d.contains(s.toLowerCase()))
                System.out.println(d);
        }

    }
}
