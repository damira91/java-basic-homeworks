package ru.kudaiberdieva.homeworks.homework13;

public class AllTerrainVehicle implements Transport {
    private int fuel;
    private Person person;


    public AllTerrainVehicle(int fuel){

        this.fuel = fuel;
        this.person = null;
    }

    @Override
    public boolean move(int distance, Location location){
        if(fuel>=distance) {
            System.out.println("All-terrain vehicle passed " + distance + " kilometres " + "in " + location);
            fuel -= distance;
            return true;
        }
        System.out.println("All-terrain vehicle can't ride because of lack of fuel");
            return false;
    }
    @Override
    public void setDriver(Person person) {
        this.person = person;
        }
}
