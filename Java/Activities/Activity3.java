package activities;

public class Activity3 {


    public static void main(String[] args) {
        double seconds = 1000000000;
        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        System.out.println("Age on Earth " + seconds /earthSeconds);
        System.out.println("Age on Mercury " + seconds / mercurySeconds /earthSeconds);
        System.out.println("Age on Venus " + seconds / venusSeconds / earthSeconds);
        System.out.println("Age on Mars " + seconds / marsSeconds / earthSeconds);
        System.out.println("Age on Jupiter " + seconds / jupiterSeconds / earthSeconds);
        System.out.println("Age on Saturn " + seconds / saturnSeconds / earthSeconds);
        System.out.println("Age on Uranus " + seconds / uranusSeconds / earthSeconds);
        System.out.println("Age on Neptune " + seconds / neptuneSeconds / earthSeconds);
    }

}
