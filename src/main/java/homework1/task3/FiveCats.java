package homework1.task3;
/* Создать класс Cat, в котором есть поля name, age, weight, isHungry. Подумать какой тип данных использовать для каждого из полей.
В классе также должны быть реализованы методы meow() и eat().
После того как кот мякнул, должна выводиться фраза “Meow” в консоль. После того как кот поел, он должен становится сытым.

Создать 5 разных объектов с типом Cat, используя цикл for */

import java.util.Random;

public class FiveCats {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {

            Cat cat = new Cat();
            String catName = cat.getName();
            String catAge = String.format("%.1f", cat.getAge());
            String catWeight = String.format("%.1f", cat.getWeight());
            boolean catHungry = cat.getIsHungry();
            System.out.println("Cat's name: " + catName + "; age: " + catAge + " y; weight: " + catWeight + "kg; is hungry: " + catHungry);
            cat.meow();
            //cat.eat();

        }
    }
}
