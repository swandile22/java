package LessonTwoHomeWork;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoisedPMProgram {

    public static void main(String[] args) {



        System.out.println("please enter your project number, project name");

        Scanner input = new Scanner(System.in);
        int projectNumber = input.nextInt();
        String projectName = input.nextLine();
        String building = input.nextLine();
        String address = input.nextLine();
        int ERFNumber = input.nextInt();
        BigDecimal totalChargeFee = input.nextBigDecimal();
        BigDecimal amountPaidToDate = input.nextBigDecimal();
        String deadline = input.nextLine();


        Project phalaPhala = new Project(
                projectNumber,
                projectName,
                building,
                address,
                ERFNumber,
                totalChargeFee,
                amountPaidToDate,
                deadline
        );

        System.out.println(phalaPhala);
    }
}
