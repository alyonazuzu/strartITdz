package homework1.task3;
/* Создать класс Cat, в котором есть поля name, age, weight, isHungry. Подумать какой тип данных использовать для каждого из полей.
В классе также должны быть реализованы методы meow() и eat().
После того как кот мякнул, должна выводиться фраза “Meow” в консоль. После того как кот поел, он должен становится сытым.

Создать 5 разных объектов с типом Cat, используя цикл for */

import java.util.Random;

public class Cat {
    private String name;
    private float age;
    private float weight;
    private boolean isHungry;

    public void meow() {
        System.out.println("Meow");
    }

    public void eat() {
        isHungry = false;
    }

    public String getName() {
        String[] catNames = {"Oscar", "Max", "Tiger", "Sam", "Misty", "Simba", "Coco", "Chloe", "Lucy", "Missy", "Molly", "Tigger", "Smokey", "Milo", "Cleo"};
        Random myRandom = new Random();
        String name = catNames[myRandom.nextInt(catNames.length - 1)];
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        float age = (float) (( Math.random() * 20) + 0.1);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        float catAge = getAge();
        float weight = 0;
        if (catAge <= 0.5) {
            weight = (float)((5.3953 * catAge) + 0.2256);
        }
        else if( catAge > 0.5 && catAge <= 1){
            weight = (float)(( Math.random() * 3.5) + 2.5);
        }
        else {
         weight = (float)(( Math.random() * 5) + 3);}
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean getIsHungry() {
        return isHungry = Math.random() < 0.5;
    }

    public void setisHungry(boolean hungry) {
        isHungry = hungry;
    }
}
