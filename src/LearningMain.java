/*
 * A package in Java - is used to group related classes. Think of it as a folder in a file directory.
 * They are used to avoid name conflicts, and to write a better and maintainable code.
 * */

import PersonLessonTwo.Person;
import calculate.calculate;

import java.util.ArrayList;

public class LearningMain {
    public static void main(String[] args) {

        ArrayList<String> ryanHobbies = new ArrayList<>();
        ryanHobbies.add("Squash");
        ryanHobbies.add("Drawing");

        Person ryan = new Person(
                "Ryan",
                "Wally",
                28,
                new ArrayList<>()
        );

        ArrayList<String> jeffHobbies = new ArrayList<>();
        jeffHobbies.add("Gaming");
        jeffHobbies.add("Coding");
        jeffHobbies.add("Skating");

        Person jeff = new Person(
                "Jeff",
                18,
                new ArrayList<>()

        );

        jeff.addHobby(jeffHobbies);
        System.out.println(jeff);
        ryan.addHobby("Singing");
        ryan.addHobby(ryanHobbies);

        System.out.println(ryan);

    }
}