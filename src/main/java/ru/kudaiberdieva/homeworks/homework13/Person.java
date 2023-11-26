package ru.kudaiberdieva.homeworks.homework13;

public class Person {
    private final String name;
    private Transport currentTransport;
    private int riderEnergy;


    public Person(String name, int riderEnergy){
        this.name=name;
        this.riderEnergy = riderEnergy;
        this.currentTransport = null;
    }


    public int getRiderEnergy() {

        return riderEnergy;
    }


    public void getInTransport(Transport transport) {
        if (currentTransport == null) {
            currentTransport = transport;
            transport.setDriver(this);
            System.out.println(name + " got in: " + currentTransport.getClass().getSimpleName());
        } else {
            System.out.println(name + " is already sitting in: " + currentTransport.getClass().getSimpleName());
        }
    }

    public void decreaseEnergy(int distance){

        riderEnergy -=distance;
    }
    public void ride(int distance,Location location){

        if(currentTransport!=null){
            currentTransport.move(distance, location);
        }else{
            System.out.println("Going by foot " + distance + " kilometres in " + location);
        }
    }
    public void getOffCurrentTransport(){
        if(currentTransport != null){
            System.out.println(name + " got off " + currentTransport.getClass().getSimpleName());
            currentTransport.setDriver(null);
            currentTransport = null;
        }else {
            System.out.println(name + " is not in transport");
        }
    }
}
