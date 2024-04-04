package LessonTwoHomeWork;



import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class PoisedPMProgram {

    public static void main(String[] args) {


        Project projectConstructor = new Project();
        projectConstructor.projectFunction();
        System.out.println("Your project information has been stored");

        Person personConstructor = new Person();
        personConstructor.personFunction();

        Person personConstructor2 = new Person();
        personConstructor2.personFunction();

        Person personConstructor3 = new Person();
        personConstructor3.personFunction();

//      Updates Total Charge Fee and Amount Paid to date
        Scanner replace = new Scanner(System.in);

        System.out.print("Please confirm the Total Charge Fee: ");
        double replaceTotalChargeFee = replace.nextDouble();
        replace.nextLine();
        System.out.print("Please confirm the Amount Paid to Date: ");
        double replaceAmountPaidToDate = replace.nextDouble();

        personConstructor.repAmount(replaceTotalChargeFee, replaceAmountPaidToDate);

//        When project doesn't have a name
        if (projectConstructor.getProjectName().isEmpty()) {
            String personLastName = personConstructor3.getLastName();
            projectConstructor.setProjectName("House" + " " + personLastName);
        }

//        Output to txt file
        double amountDue = replaceTotalChargeFee - replaceAmountPaidToDate;
        int compareProjectNumber = projectConstructor.getProjectNumber();
        int personProjectNumber = personConstructor.getPersonProjectNumber();
        int person2ProjectNumber = personConstructor2.getPersonProjectNumber();
        int person3ProjectNumber = personConstructor3.getPersonProjectNumber();
        String personProjectRole = personConstructor3.getRole();

        if ((amountDue > 0) &&
                (personProjectNumber == compareProjectNumber) &&
                (person2ProjectNumber == compareProjectNumber) &&
                (person3ProjectNumber == compareProjectNumber) &&
                (personProjectRole.equalsIgnoreCase("customer"))) {
           try {
               FileWriter projectInvoice = new FileWriter(new File("src/LessonTwoHomeWork/Invoices", "project_" + projectConstructor.getProjectNumber() + "_invoice.txt"));
               projectInvoice.write(String.valueOf(projectConstructor));
               projectInvoice.write(String.valueOf(personConstructor));
               projectInvoice.write(String.valueOf(personConstructor2));
               projectInvoice.write(String.valueOf(personConstructor3));
               projectInvoice.write(" The amount due is: R"+ amountDue);
               projectInvoice.close();
               System.out.println("Your invoice has been created");
           } catch (IOException e) {
               System.out.println("An error occurred");
               e.printStackTrace();
           }

            }
        else if (amountDue == 0) {
            System.out.println("Project is finalised");
        }



        }
        }
