/*
* With, inheritance you,re able to use the constructors and methods of the parent class(Cats)
* in the children classes(Lion), It allows us to connect two classes to one another while adding different
* functionalities to a specific one.
 */

package LessonThreeInheritance;

public class CatsMain {

    public static void main(String[] args) {

        Cats garfield = new Cats("Garfield", "Orange", 33);
        Lion simba = new Lion("Simba", "Blue", 3300, true);

        System.out.println(garfield);
        garfield.meow();
        garfield.purr();
        System.out.println("********************");

        System.out.println(simba);
        simba.meow();
        simba.purr();
        System.out.println("********************");
    }

}
