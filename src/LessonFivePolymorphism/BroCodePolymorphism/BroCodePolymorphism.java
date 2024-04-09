package LessonFivePolymorphism.BroCodePolymorphism;

public class BroCodePolymorphism {

    public static void main(String[] args) {
        // Polymorphism = greek word for poly- "many", morph-"form"
        // The ability of an object to identify as more than one type

        // In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
        // Also known as enhanced for loop

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle x: racers) {
            x.go();
        }
    }
}
