package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man = new Man("Vitalik", 29, "40 let Pobedy 15");
        Man man1 = new Man("Alexandr", 31,"Oficerskaya 2a");
        Woman woman = new Woman ("Maria",22, "40 let Pobedy 15");
        Woman woman1 = new Woman("Lena", 27, "Oficerskaya 2a");

        System.out.println(man.name+" "+man.age+" "+man.address);
        System.out.println(woman.name+" "+woman.age+" "+woman.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(man1.name+" "+man1.age+" "+man1.address);//выведи их на экран тут
    }

    public static class Man {
        private String name = null;
        private int age;
        private String address = null;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
     public static class Woman{
         private String name = null;
         private int age;
         private String address = null;

         public Woman(String name, int age, String address){
             this.name = name;
             this.age = age;
             this.address = address;
         }
     }
}
//добавьте тут ваши классы

