package LessonTwoHomeWork;


import java.util.Scanner;


public class PoisedPMProgram {

    public static void main(String[] args) {


        Project projectConstructor = new Project();
        projectConstructor.projectFunction();
        System.out.println(projectConstructor);

        Person personConstructor = new Person();
        personConstructor.personFunction();
     System.out.println(personConstructor);
    }


}
