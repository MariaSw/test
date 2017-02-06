package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args){
        System.out.println(getCountTheSameFirstName(createMap(), "Маша"));
        System.out.println(getCountTheSameLastName(createMap(), "Третьяков"));
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Крывун", "Маша");
        map.put("Пупкин", "Вася");
        map.put("Малик", "Никита");
        map.put("Рузанова", "Маша");
        map.put("Банникова", "Лена");
        map.put("Третьяков", "Борис");
        map.put("Улитина", "Улиточка");
        map.put("Хельбот", "Наташа");
        map.put("Бугакова", "Ксюша");
        map.put("Шмик", "Элла");
        return map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair:map.entrySet())
            if (name.equals(pair.getValue())) count++;//напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String,String> pair:map.entrySet()) {
            if (lastName.equals(pair.getKey())) count++;
        }
        return count;//напишите тут ваш код
    }
}
