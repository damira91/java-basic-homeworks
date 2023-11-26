package ru.kudaiberdieva.homeworks.homework13;

public class Bicycle implements Transport {
    private Person person;

    public Bicycle(){
        this.person = null;
    }

    @Override
    public boolean move(int distance,Location location){

        if(location == Location.SWAMP){
            System.out.println("Bicycle can't ride " + Location.SWAMP);
            return false;
        }

        if(person.getRiderEnergy()>=distance){
            System.out.println("Bicycle passed " + distance);
            person.decreaseEnergy(distance);
            return true;
        }
            System.out.println("Rider is tired and can't move further");
            return false;

    }
    @Override
    public void setDriver(Person person) {
        this.person = person;

    }
}
