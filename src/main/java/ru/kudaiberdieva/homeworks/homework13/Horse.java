package ru.kudaiberdieva.homeworks.homework13;

public class Horse implements Transport {
     private int power;
     private Person person;


     public Horse(int power){

          this.power = power;
          this.person = null;
     }

     @Override
     public boolean move(int distance, Location location){
          if(location == Location.SWAMP){
               System.out.println("Horse can't ride this " + Location.SWAMP);
               return false;
          }
          if(power>=distance){
               System.out.println("Horse passed " + distance + " kilometres" + location);
               power-=distance;
               return true;
          } else{
               System.out.println("Horse can't ride because is tired");
               return false;
          }
     }
     @Override
     public void setDriver(Person person) {
          this.person = person;

     }
}
