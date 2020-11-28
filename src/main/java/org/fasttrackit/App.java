package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\uD83D\uDE97 Wellcome to Racing Game \uD83D\uDE97  " );
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

       carReference.accelerate(250, 2);





    }

}
