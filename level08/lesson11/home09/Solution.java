package com.javarush.test.level08.lesson11.home09;


import java.text.ParseException;

import java.util.Date;



/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("january 3 2000"));
    }


    public static boolean isDateOdd(String date) throws ParseException {

        Date latedate = new Date(date);
        Date earlydate = new Date(date);
        earlydate.setMonth(1);
        earlydate.setDate(1);

        long Distance = latedate.getTime()-earlydate.getTime();
        return (Distance/1000/60/60/24)%2!=0;
    }

}
