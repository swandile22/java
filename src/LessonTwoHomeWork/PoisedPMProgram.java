package LessonTwoHomeWork;


import java.math.BigDecimal;
import java.util.Scanner;


public class PoisedPMProgram {

    public static void main(String[] args) {


        Project projectConstructor = new Project();
        projectConstructor.projectFunction();
        System.out.println("Your project information has been stored");

//        Updates Total Charge Fee and Amount Paid to date
        Scanner replace = new Scanner(System.in);

        System.out.print("Please confirm the Total Charge Fee: ");
        BigDecimal replaceTotalChargeFee = replace.nextBigDecimal();
        replace.nextLine();
        System.out.print("Please confirm the Amount Paid to Date: ");
        BigDecimal replaceAmountPaidToDate = replace.nextBigDecimal();

        projectConstructor.repAmount(replaceTotalChargeFee, replaceAmountPaidToDate);

        Person personConstructor = new Person();
        personConstructor.personFunction();

//        When project doesn't have a name
        if (projectConstructor.getProjectName().isEmpty()) {
            String personLastName = personConstructor.getLastName();
            projectConstructor.setProjectName("House" + " " + personLastName);
        }

        System.out.println(projectConstructor);
        System.out.println(personConstructor);
      }


    }
