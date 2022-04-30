package activities;

public class Car {

    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    Car(){
        tyres = 4;
        doors = 4;
    }


    public void displayCharacteristics(){
        System.out.println("The color of the car is " + color);
        System.out.println("The car make of year " + make);
        System.out.println("The car is of " + transmission + " transmission type");
        System.out.println("Car has " + tyres + " tyres");
        System.out.println("Car has " + doors + " doors");
    }

    public void accelerate(){
        System.out.println("Car moves forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }


}
