package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Game game = new Game();
game.start();


        Car carReference= new Car();
        carReference.make ="Skoda";
        carReference.model ="Fabia";
        carReference.mileage =7.5;
        carReference.fuellevel = 60;
        carReference.color ="black";
        carReference.maxSpeed = 300;

       Engine engine1 = new Engine();
       engine1.manufacturer = "VW";
       engine1.capacity = 1900;

       carReference.engine = engine1;

       double currentDistance = carReference.accelerate(250, 2);
        System.out.println("Total Distance before repaire:" + carReference.totalTravelDistance);
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Total Distance after repaire:" + carReference.totalTravelDistance);

        Car car2 = new Car();
       car2.make = "Mercedes";
       car2.model = "CLS";
       car2.color = "red";

        double car2Distance = car2.accelerate(120, 3);



        car2.make = carReference.make;






    }

}
