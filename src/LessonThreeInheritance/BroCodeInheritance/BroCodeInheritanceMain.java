/*
* Inheritance = the process of one class acquiring the attributes of another
*
*/

package LessonThreeInheritance.BroCodeInheritance;

public class BroCodeInheritanceMain {

    public static void main(String[] args) {


        Car car = new Car("Red",
                4,
                80,
                "Hyper car",
                "Automatic");

        System.out.println(car);
        car.go();
        car.stop();

        Bicycle bicycle = new Bicycle("Silver",
                2,
                40,
                2);
        System.out.println(bicycle);
        bicycle.go();
        bicycle.stop();


    }
}
