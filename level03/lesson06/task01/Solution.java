package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s1= "Мама";
        String s2= "Мыла";
        String s3= "Раму";

        String a = s1+s2+s3;
        String b = s2+s3+s1;
        String f = s3+s1+s2;
        String g = s1+s3+s2;
        String h = s2+s1+s3;
        String i = s3+s2+s1;


        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        //напишите тут ваш код

    }
}