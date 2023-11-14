package ru.kudaiberdieva.homeworks.homework11;

public class Dog extends Animal{

    public Dog (String name, int runSpeed, int swimSpeed, int stamina, boolean isTired){
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.runCosts = 1;
        this.swimCosts = 2;
        this.isTired = isTired;
        }

}
