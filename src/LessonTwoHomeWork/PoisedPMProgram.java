package LessonTwoHomeWork;



import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class PoisedPMProgram {

    public static void main(String[] args) {


        Project projectConstructor = new Project();
        projectConstructor.projectFunction();
        System.out.println("Your project information has been stored");

//        Updates Total Charge Fee and Amount Paid to date
        Scanner replace = new Scanner(System.in);

        System.out.print("Please confirm the Total Charge Fee: ");
        double replaceTotalChargeFee = replace.nextDouble();
        replace.nextLine();
        System.out.print("Please confirm the Amount Paid to Date: ");
        double replaceAmountPaidToDate = replace.nextDouble();

//        Updating Charge fee and Amount paid
        projectConstructor.repAmount(replaceTotalChargeFee, replaceAmountPaidToDate);

        Person personConstructor = new Person();
        personConstructor.personFunction();

//        When project doesn't have a name
        if (projectConstructor.getProjectName().isEmpty()) {
            String personLastName = personConstructor.getLastName();
            projectConstructor.setProjectName("House" + " " + personLastName);
        }

        double finalChargeFee = replaceTotalChargeFee;
        double finalAmountPaid = replaceAmountPaidToDate;
        double amountDue = finalChargeFee - finalAmountPaid;

        if (amountDue > 0) {
           try {
               FileWriter projectInvoice = new FileWriter("project_" + projectConstructor.getProjectNumber() + "_invoice.txt");
               projectInvoice.write(String.valueOf(projectConstructor));
               projectInvoice.write(String.valueOf(personConstructor));
               projectInvoice.write("The amount due is: R"+ amountDue);
               projectInvoice.close();
               System.out.println("Your invoice has been created");
           } catch (IOException e) {
               System.out.println("An error occurred");
               e.printStackTrace();
           }

            }
        else {
            System.out.println("Project is finalised");
        }
        }
        }
