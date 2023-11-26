package ru.kudaiberdieva.homeworks.homework13;

public class TravelApp {
    public static void main(String[] args) {
        Person person = new Person("Tom",60);
        Car car = new Car(100);
        Bicycle bicycle = new Bicycle();
        Horse horse = new Horse(80);
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle(200);



        person.getInTransport(car);
        person.ride(70, Location.PLAIN);
        person.ride(20, Location.FOREST);
        person.getOffCurrentTransport();

        person.getInTransport(bicycle);
        person.ride( 45, Location.FOREST);
        person.getOffCurrentTransport();

        person.getInTransport(horse);
        person.ride(90, Location.PLAIN);
        person.getOffCurrentTransport();

        person.getInTransport(allTerrainVehicle);
        person.ride(180, Location.SWAMP);
        person.getOffCurrentTransport();

        person.ride(60, Location.FOREST);

        }
    }
