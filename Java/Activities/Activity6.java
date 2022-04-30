package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onBoard("Harry");
        plane.onBoard("Tom");
        plane.onBoard("Andy");
        System.out.println("Print the take-off time using the takeOff() method");
        System.out.println(plane.takeOff());
        System.out.println("Print the list of passengers using the getPassengers() method");
        System.out.println(plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Print the time of landing using getLastTimeLanded() method");
        System.out.println(plane.getLastTimeLanded());
    }

}
