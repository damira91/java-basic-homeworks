package ru.kudaiberdieva.homeworks.homework11;

public class Horse extends Animal {

    public Horse (String name, int runSpeed, int swimSpeed, int stamina, boolean isTired){
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.isTired = isTired;
        this.runCosts = 1;
        this.swimCosts = 4;
    }

}
