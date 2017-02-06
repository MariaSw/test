package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.// через контаинс
*/

public class Solution
{
    public static void main(String[] args){
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        //removeItemFromMapByValue(map, null);
        System.out.println(map);
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Крывун", "Маша");
        map.put("Пупкин", "Никита");
        map.put("Малик", "Никита");
        map.put("Рузанова", "Маша");
        map.put("Банникова", "Маша");
        map.put("Третьяков", "Никита");
        map.put("Улитина", "Улиточка");
        map.put("Хельбот", "Наташа");
        map.put("Бугакова", "Маша");
        map.put("Шмик", "Элла");
        return map;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        HashMap<String, String> map1 = new HashMap<>();/** новая корта для перекладывания**/
        ArrayList<String> dublicates = new ArrayList<>();/** для одиночных экземпляров дубликатов**/
        String val, key;
        for (Map.Entry<String, String> pair:map.entrySet()) {
            val = pair.getValue();
            key = pair.getKey();
            if (map1.containsValue(val)) {/**перекладываем по очереди в пустой массив**/
                if (!dublicates.contains(val)) dublicates.add(val);/**если значение повторяется и его еще нет
                 в списке дубликатов,кладем его в список дубликатов**/
                continue;
            }
            else
                map1.put(key, val);
        }
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            for (String s : dublicates) {/**Если какой либо из дубликатов соответствует значению в карте, удаляем запись в карте*/
                if (s.equals(pair.getValue()))
                    iterator.remove();
            }
        }
        }
    /*public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);//размером с map
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }*/
}

