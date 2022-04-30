package activities;

public class Activity1 extends Car {

   public static void main(String[] args) {
      Car Toyota = new Car();
      Toyota.color = "Black";
      Toyota.transmission = "Manual";
      Toyota.make = 2014;

      System.out.println("Characteristics of the car are ");
      Toyota.displayCharacteristics();

      System.out.println("When accelerated ");
      Toyota.accelerate();
      System.out.println("When brakes are applied ");
      Toyota.brake();
   }
}


