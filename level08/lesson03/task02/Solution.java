package com.javarush.test.level08.lesson03.task02;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> plantmap = new HashMap<>();
        plantmap.put("арбуз", "ягода");
        plantmap.put("банан", "трава");
        plantmap.put("вишня", "ягода");
        plantmap.put("груша", "фрукт");
        plantmap.put("дыня", "овощ");
        plantmap.put("ежевика", "куст");
        plantmap.put("жень-шень", "корень");
        plantmap.put("земляника", "ягода");
        plantmap.put("ирис", "цветок");
        plantmap.put("картофель", "клубень");

        Iterator<Map.Entry<String,String>> plantiterator = plantmap.entrySet().iterator();
        while(plantiterator.hasNext()){
            Map.Entry<String,String> pair = plantiterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+" - "+value);
        }

        //напишите тут ваш код

    }
}
