package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Racing Game" );
        Car carReference= new Car();
        carReference.make ="Skoda";
        carReference.model ="Fabia";
        carReference.mileage =7.5;
        carReference.fuellevel = 60;
        carReference.color ="black";
        carReference.maxSpeed = 300;

        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuellevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);



    }
}
