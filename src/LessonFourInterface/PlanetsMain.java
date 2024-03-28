/*
* Interface cannot have a body, it contains methods, which are then declared in the classes
* that the interface shares with
*
* It is designed to be something that's going to be shared across multiple different types
* */
package LessonFourInterface;

public class PlanetsMain {

    public static void main(String[] args) {

        RockyPlanet earth = new RockyPlanet("Earth",
                true,
                18);
        GasGiant jupiter = new GasGiant("Jupiter",
                "Gassy gas",
                18*300);

        Planets planetOfEarth = (Planets) earth;
        Planets planetOfJupiter = (Planets) jupiter;

        if (earth instanceof Planets) {
            System.out.println(earth.getFullClassification());
        }

        if (jupiter instanceof Planets) {
            System.out.println(jupiter.getFullClassification());
        }

//        System.out.println(earth.getFullClassification());
//        System.out.println(jupiter.getFullClassification());
    }
}
