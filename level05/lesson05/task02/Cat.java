package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int AgePlus = this.age>anotherCat.age?1:0;
        int WeightPlus = this.weight>anotherCat.weight?1:0;
        int StrengthPlus = this.strength>anotherCat.strength?1:0;

        int Winner = AgePlus+WeightPlus+StrengthPlus;
        return Winner>=2; //если у первого кота будут больше хотя бы 2 параметра, то выиграет он.


        //напишите тут ваш код

    }
}
/*Cat cat1 = new Cat();
        cat1.name = "GlenGlen";
        cat1.age = 6;
        cat1.weight = 10;
        cat1.strength = 15;


        Cat cat2 = new Cat();
        cat2.name = "Luis";
        cat2.age = 5;
        cat2.weight = 8;
        cat2.strength = 10;*/