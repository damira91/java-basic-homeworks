package ru.kudaiberdieva.homeworks.homework11;

public class MainApplication {


    public static void main(String[] args) {
        Cat cat = new Cat("Felix", 13, 40, 0, 0, false);
        cat.info();
        if(!cat.isTired){
            System.out.println("Running time:  " + cat.run(280) + " seconds");
        }else{
        System.out.println("Cat is tired");
        }
        cat.swim(200);
        cat.info();
        if(!cat.isTired){
            System.out.println("Running time: " + cat.run(130) + " seconds");
        }else{
        System.out.println("Cat is tired");
        }
        Dog dog = new Dog("Spot", 15, 2, 800, false);
        dog.info();
        if(!dog.isTired){
            System.out.println("Running time: " + dog.run(400) + " seconds");
        }else{
            System.out.println("Dog is tired");
        }

        dog.info();
        if(!dog.isTired){
            System.out.println("Swimming time: " + dog.swim(110) + " seconds");
        }else {
            System.out.println("Dog is tired");
        }
        dog.info();

        Horse horse = new Horse("Spirit",20,4, 1500, false);
        horse.info();
        if(!horse.isTired){
            System.out.println("Running time: " + horse.run(400) + " seconds");
        }else{
            System.out.println("Horse is tired");
        }
        if(!horse.isTired){
            System.out.println("Swimming time: " + horse.swim(110) + " seconds");
        }else {
            System.out.println("Horse is tired");
        }
        horse.info();
    }
}