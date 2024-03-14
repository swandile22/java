package LessonTwoHomeWork;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoisedPMProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the following project information," +
                " " + "Type " + "done" + " " + "to finish.");

        Project clearWater = null;

        while (true) {

            System.out.print("Project number: ");
            int projectNumber = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Project name: ");
            String projectName = input.nextLine();
            System.out.print("Building type: ");
            String building = input.nextLine();
            System.out.print("Address: ");
            String address = input.nextLine();
            System.out.print("ERF number: ");
            int ERFNumber = input.nextInt();
            System.out.print("Total charge fee: ");
            BigDecimal totalChargeFee = input.nextBigDecimal();
            System.out.print("Amount paid to date: ");
            BigDecimal amountPaidToDate = input.nextBigDecimal();
            input.nextLine(); // Consume newline
            System.out.print("Deadline: ");
            String deadline = input.nextLine();
            System.out.print("Enter 'done' to finish or press Enter to continue: ");
            String userInput = input.nextLine();


            if (userInput.equalsIgnoreCase("done")) {
                clearWater = new Project(projectNumber,
                        projectName,
                        building,
                        address,
                        ERFNumber,
                        totalChargeFee,
                        amountPaidToDate,
                        deadline
                );
                break;
            }
        }

        System.out.println(clearWater);
    }
}
