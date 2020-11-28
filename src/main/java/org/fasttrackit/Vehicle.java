package org.fasttrackit;

public class Vehicle {
    String make;
    String model;
    String color;

    double mileage;
    double fuellevel;
    double maxSpeed;
    double totalTravelDistance;
    boolean damaged;
    public double accelerate( double speed, double durationInHours){
        System.out.println(make + "is acceleratin with "+ speed + " km/h for" + durationInHours + "h");
        double distance = speed * durationInHours;
        totalTravelDistance += distance;
        System.out.println("total travel distance" + totalTravelDistance);

        double usedFuel = distance * mileage / 100;
        fuellevel-= usedFuel;
        System.out.println("Remaining fuel" + fuellevel);



        return distance;

    }
}
