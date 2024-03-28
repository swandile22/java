package LessonThreeInheritance.BroCodeInheritance;

public class Car extends Vehicle{

    private String typeOfCar;
    private String transmission;

    public Car(String vehicleColour, int numberOfWheels, double speed, String typeOfCar, String transmission) {
        super(vehicleColour, numberOfWheels, speed);
        this.typeOfCar = typeOfCar;
        this.transmission = transmission;
}

    @Override
    public String toString() {
        String output = "********************";
        output += "\nVehicle colour: " + vehicleColour;
        output += "\nNumber of wheels: " + numberOfWheels;
        output += "\nSpeed: " + speed + " km/h";
        output += "\nType of car: " + typeOfCar;
        output += "\nTransmission: " + transmission;
        output += "\n********************";
        return output;
    }



}
