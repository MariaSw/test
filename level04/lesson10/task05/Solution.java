package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 1;
        int y = 1;

        /*while (x<=10){
            System.out.println(x+" "+x*2+" "+x*3+" "+x*4+" "+x*5+" "+x*6+" "+x*7+" "+x*8+" "+x*9+" "+x*10);
            x++;*/
        while (x<=10) {
            while (y <=10) {
                System.out.print(x * y+" ");
                y++;
            }
            System.out.println();
            y=1;
            x++;
        }

        }




    }


