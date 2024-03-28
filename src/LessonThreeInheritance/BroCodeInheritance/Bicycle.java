package LessonThreeInheritance.BroCodeInheritance;

public class Bicycle extends Vehicle{

    private int numberOfPedals;

    public Bicycle(String vehicleColour, int numberOfWheels, double speed, int numberOfPedals) {
        super(vehicleColour, numberOfWheels, speed);
        this.numberOfPedals = numberOfPedals;
    }

    @Override
    public void go() {
        System.out.println("The cyclist is pedalling");
    }

    @Override
    public void stop() {
        System.out.println("The cyclist has stopped the bike");
    }

    @Override
    public String toString() {
        String output = "********************";
        output += "\nBicycle colour: " + vehicleColour;
        output += "\nNumber of wheels: " + numberOfWheels;
        output += "\nSpeed: " + speed + " km/h";
        output += "\nNumber of pedals: " + numberOfPedals;
        output += "\n********************";
        return output;
    }

}
