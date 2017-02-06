package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        while (true) {
            String s = bis.readLine();
            if (s.isEmpty()) break;
            list1.add(s);
        }

        list1 = fix(list1);



        for (String s : list1) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).contains(Character.toString('р'))&&list.get(i).contains(Character.toString('л'))){
                i++;
                continue;}
            else if (list.get(i).contains(Character.toString('р'))) {
                list.remove(i);
            } else if (list.get(i).contains(Character.toString('л'))) {
                list.add(i+1, list.get(i));
                i=i+2;
            } else
                i++;
        }
        return list;
    }
}