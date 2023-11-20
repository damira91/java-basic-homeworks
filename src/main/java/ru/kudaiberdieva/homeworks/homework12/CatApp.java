package ru.kudaiberdieva.homeworks.homework12;

import java.util.Arrays;

public class CatApp {
    public static void main(String[] args) {
        Plate plate = new Plate(930, 900);
        plate.info();
        plate.add(30);
        plate.reduce(100);
        plate.info();


        Cat cat = new Cat("Garfield", 80, false);
        cat.eat(plate);
        if(cat.getIsFull()){
            System.out.println("Cat is well-fed and wants to play");
        } else{
            System.out.println("Food is not enough cat is hungry");
        }
        Cat[] cats = {
                new Cat("Felix", 240, false),
                new Cat("Lucky", 170, false),
                new Cat("Simba", 150, false),
                new Cat("Kitty", 190, false),
                new Cat("Silver", 200, false)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        System.out.println(Arrays.toString(cats));
    }

}
