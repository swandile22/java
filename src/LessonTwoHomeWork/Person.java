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

    public Person(String role, String personId, int personProjectNumber, String firstName, String lastName, String contactNumber, String emailAddress, String physicalAddress) {
        this.role = role;
        this.personId = personId;
        this.personProjectNumber = personProjectNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;

    }

    public Person() {

    }

    public String getRole() {return this.role;}
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

    public Person personFunction() {
    Scanner personInput = new Scanner(System.in);

        System.out.println("please enter your details" +
                " " + "Type " + "done" + " " + "to finish.");
    Person matthew = null;

        while (true) {
            System.out.print("Role: ");
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

