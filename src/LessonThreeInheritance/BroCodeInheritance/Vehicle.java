package LessonThreeInheritance.BroCodeInheritance;

public class Vehicle {

    public String vehicleColour;
    public int numberOfWheels;
    public double speed;

    public Vehicle(String vehicleColour, int numberOfWheels, double speed) {
        this.vehicleColour = vehicleColour;
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    public void go() {
        System.out.println("The vehicle is moving");
    }

    public void stop() {
        System.out.println("The vehicle has stopped");
    }


}
