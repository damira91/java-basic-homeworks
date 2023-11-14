package ru.kudaiberdieva.homeworks.homework11;

public class Cat extends Animal {
    public Cat (String name, int runSpeed, int stamina, int swimSpeed, int swimCosts, boolean isTired){
        this.name = name;
        this.runSpeed = runSpeed;
        this.stamina = stamina;
        this.runCosts = 1;
        this.swimSpeed = 0;
        this.swimCosts = 0;
        this.isTired = isTired;
    }

}
