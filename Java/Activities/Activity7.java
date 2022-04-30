package activities;
    interface BicycleParts{
        public int gears = 0;
        public int currentSpeed = 0;
    }

    interface BicycleOperations{
        public void applyBrake(int decrement);
        public void speedUp(int increment);
    }

    class Bicycle implements BicycleParts, BicycleOperations{
        public int gears;
        public int currentSpeed;

        public Bicycle (int gears, int currentSpeed){
            this.gears = gears;
            this.currentSpeed = currentSpeed;
        }

        public void applyBrake(int decrement){
            currentSpeed = currentSpeed - decrement;
            System.out.println("Current Speed--> "+currentSpeed);
        }

        public void speedUp(int increament){
            currentSpeed = currentSpeed + increament;
            System.out.println("Current Speed--> "+currentSpeed);
        }

        public String bicycleInfo(){
            return ("No of gears are--> "+ gears + "\nSpeed of bicycle is-->" + currentSpeed);
        }
    }

    class MountainBike extends Bicycle{
        public int seatHeight;

        public MountainBike(int gears, int currentSpeed, int startHeight) {
            super(gears, currentSpeed);
            seatHeight = startHeight;
        }

        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        public String bicycleDesc() {
            return (super.bicycleInfo()+ "\nSeat height is--> " + seatHeight);
        }
    }
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 10, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}







