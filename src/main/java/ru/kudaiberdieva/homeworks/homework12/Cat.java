package ru.kudaiberdieva.homeworks.homework12;

public class Cat {
    private final String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite, boolean isFull){
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
   public String getName(){
       return name;
   }

    public void setAppetite(int appetite){
        this.appetite = appetite;
    }
    public boolean getIsFull(){
        return isFull;
    }
    public void eat(Plate plate){
        if(plate.getFood() < appetite){
            return;
        }
        if(plate.getFood()>=appetite){
            plate.reduce(appetite);
            isFull = true;
        }
    }

    @Override
    public String toString(){
        return "Cat: " + name + " " + isFull;
    }

}
