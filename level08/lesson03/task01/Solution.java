package com.javarush.test.level08.lesson03.task01;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> PlSet = new HashSet<String>();
        PlSet.add("арбуз");
        PlSet.add("банан");
        PlSet.add("вишня");
        PlSet.add("груша");
        PlSet.add("дыня");
        PlSet.add("ежевика");
        PlSet.add("жень-шень");
        PlSet.add("земляника");
        PlSet.add("ирис");
        PlSet.add("картофель");

        /*Iterator<String> Pliterator = PlSet.iterator();

        while(Pliterator.hasNext()){
            String s = Pliterator.next();
            System.out.println(s);
        }*/
        for (String s:PlSet) {
            System.out.println(s);
        }
        //напишите тут ваш код

    }
}
