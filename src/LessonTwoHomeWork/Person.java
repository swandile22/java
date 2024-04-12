package LessonTwoHomeWork;////////////////////////////////////////////package LessonTwoHomeWork;

import java.util.Scanner;

public class Person {

    private String role;
    private String personId;

    private int personProjectNumber;

    private String firstName;

    private String lastName;

    private String contactNumber;

    private String emailAddress;

    private String physicalAddress;

    private double totalChargeFee;

    private double amountPaidToDate;


    public Person(String role, String personId, int personProjectNumber, String firstName, String lastName, String contactNumber, String emailAddress, String physicalAddress, double totalChargeFee, double amountPaidToDate) {
        this.role = role;
        this.personId = personId;
        this.personProjectNumber = personProjectNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
        this.totalChargeFee = totalChargeFee;
        this.amountPaidToDate = amountPaidToDate;


    }

    public Person() {

    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String newRole) {
        this.role = newRole;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String newID) {
        this.personId = newID;
    }

    public int getPersonProjectNumber() {
        return this.personProjectNumber;
    }

    public void setPersonProjectNumber(int newPersonProjectNumber) {
        this.personProjectNumber = newPersonProjectNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String newContactNumber) {
        this.contactNumber = newContactNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String newEmailAddress) {
        this.emailAddress = newEmailAddress;
    }

    public String getPhysicalAddress() {
        return this.physicalAddress;
    }

    public void setPhysicalAddress(String newPhysicalAddress) {
        this.physicalAddress = newPhysicalAddress;
    }

    public double getTotalChargeFee() {
        return totalChargeFee;
    }

    public void setTotalChargeFee(double totalChargeFee) {
        this.totalChargeFee = totalChargeFee;
    }


    public double getAmountPaidToDate() {
        return amountPaidToDate;
    }

    public void setAmountPaidToDate(double amountPaidToDate) {
        this.amountPaidToDate = amountPaidToDate;
    }

    public Person personFunction() {
        Scanner personInput = new Scanner(System.in);

        System.out.println("\nplease enter your details" +
                " " + "Type " + "done" + " " + "to finish.");
        Person matthew = null;

        while (true) {
            System.out.print("Role(Architect/Contractor/Customer): ");
            String role = personInput.nextLine();
            System.out.print(role + " " + "ID: ");
            String personId = personInput.nextLine();

            System.out.print("Project Number: ");
            int personProjectNumber = personInput.nextInt();
            personInput.nextLine();

            System.out.print("First Name: ");
            String firstName = personInput.nextLine();

            System.out.print("Last Name: ");
            String lastName = personInput.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = personInput.nextLine();

            System.out.print("Email Address: ");
            String emailAddress = personInput.nextLine();

            System.out.print("Physical Address: ");
            String physicalAddress = personInput.nextLine();

            if (role.equalsIgnoreCase("customer")) {

                System.out.print("Total charge fee: ");
                double totalChargeFee = personInput.nextDouble();

                System.out.print("Amount paid to date: ");
                double amountPaidToDate = personInput.nextDouble();
                personInput.nextLine();

            }


            System.out.print("Enter 'done' to finish or press Enter to continue: ");
            String personDone = personInput.nextLine();


            if (personDone.equalsIgnoreCase("done")) {
                this.role = role;
                this.personId = personId;
                this.personProjectNumber = personProjectNumber;
                this.firstName = firstName;
                this.lastName = lastName;
                this.contactNumber = contactNumber;
                this.emailAddress = emailAddress;
                this.physicalAddress = physicalAddress;

                break;
            }
        }

        return matthew;
    }


    public void repAmount(double newTotalChargeFee, double newAmountPaidToDate) {
        this.totalChargeFee = newTotalChargeFee;
        this.amountPaidToDate = newAmountPaidToDate;
    }

    @Override
    public String toString() {
        String personOutput = "*********************************";
        personOutput += "\nRole:" + " " + role;
        personOutput += "\nPerson ID:" + " " + personId;
        personOutput += "\nProject Number:" + " " + personProjectNumber;
        personOutput += "\nFirst Name:" + " " + firstName;
        personOutput += "\nLast Name:" + " " + lastName;
        personOutput += "\nContact Number:" + " " + contactNumber;
        personOutput += "\nEmail Address:" + " " + emailAddress;
        personOutput += "\nPhysical Address:" + " " + physicalAddress;
        personOutput += "\n*********************************";
        return personOutput;
    }
}

