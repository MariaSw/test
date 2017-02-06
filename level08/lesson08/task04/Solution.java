package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Kryvun", new Date("JUNE 29 1994"));
        map.put("Turovinina", new Date("AUGUST 25 1980"));
        map.put("Arestova", new Date("JANUARY 1 1980"));
        map.put("Novitskaya", new Date("NOVEMBER 1 1980"));
        map.put("Lemeshev", new Date("DECEMBER 1 1980"));
        map.put("Zubkov", new Date("APRIL 1 1980"));
        map.put("Gashneva", new Date("APRIL 1 1980"));
        map.put("Zubenya", new Date("APRIL 1 1980"));
        map.put("Alekseeva", new Date("JULY 1 1980"));
        return map;

        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth()==5||pair.getValue().getMonth()==6||pair.getValue().getMonth()==7)
                iterator.remove();

            /*String s = pair.getValue().toString();
            if (s.contains("Jun")||s.contains("Jul")||s.contains("Aug"))
                iterator.remove();//напишите тут ваш код*/
        }

    }
}
