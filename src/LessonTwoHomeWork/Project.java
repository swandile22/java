package LessonTwoHomeWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Project {

    private int projectNumber;

    private String projectName;

    private String buildingType;

    private String projectAddress;

    private int ERFNumber;

    private String projectDeadline;


    public Project(int projectNumber, String projectName, String buildingType, String projectAddress,
                   int ERFNumber, String projectDeadline) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.projectAddress = projectAddress;
        this.ERFNumber = ERFNumber;
        this.projectDeadline = projectDeadline;
    }

    public Project() {

    }


    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }


    public String getProjectName() {
        return projectName;
    }

    public String setProjectName(String projectName) {
        this.projectName = projectName;
        return projectName;
    }


    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }


    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }


    public int getERFNumber() {
        return ERFNumber;
    }

    public void setERFNumber(int ERFNumber) {
        this.ERFNumber = ERFNumber;
    }


    public String getProjectDeadline() {
        return projectDeadline;
    }

    public void setProjectDeadline(String projectDeadline) {
        this.projectDeadline = projectDeadline;
    }


    @Override
    public String toString() {
        String output = "***********************************";
        output += "\nProject Number:" + " " + projectNumber;
        output += "\nProject Name:" + " " + projectName;
        output += "\nBuilding Type:" + " " + buildingType;
        output += "\nProject Address:" + " " + projectAddress;
        output += "\nERF Number:" + " " + ERFNumber;
        output += "\nProject Deadline:" + " " + projectDeadline;
        output += "\n***********************************";
        return output;

    }


    public Project projectFunction() {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the following project information," +
                " " + "Type " + "done" + " " + "to finish.");

        while (true) {

            System.out.print("Project number: ");
            int projectNumber = input.nextInt();
            input.nextLine();

            System.out.print("Project name: ");
            String projectName = input.nextLine();

            System.out.print("Building type: ");
            String buildingType = input.nextLine();

            System.out.print("Address: ");
            String projectAddress = input.nextLine();

            System.out.print("ERF number: ");
            int ERFNumber = input.nextInt();
            input.nextLine();

            System.out.print("Deadline(yyyy-MM-dd): ");
            String projectDeadline = input.nextLine();

            System.out.print("Enter 'done' to finish or press Enter to continue: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("done")) {
                this.projectNumber = projectNumber;
                this.projectName = projectName;
                this.buildingType = buildingType;
                this.projectAddress = projectAddress;
                this.ERFNumber = ERFNumber;
                this.projectDeadline = projectDeadline;

                return this;
            }
        }
    }


    public void repProjectNumber(int newProjectNumber) {
        this.projectNumber = newProjectNumber;
    }

    public void repProjectName(String newProjectName) {
        this.projectName = newProjectName;
    }

    public void repBuildingType(String newBuildingType) {
        this.buildingType = newBuildingType;
    }

    public void repProjectAddress(String newProjectAddress) {
        this.projectAddress = newProjectAddress;
    }

    public void repERFNumber(int newERFNumber) {
        this.ERFNumber = newERFNumber;
    }

    public void repDeadline(String newDeadline) {
        this.projectDeadline = newDeadline;
    }

    public void addProjectName(String projectName) {
        this.projectName = "House";
    }


    public void dateFormat() {
        LocalDate currentDate = LocalDate.now();
        LocalDate userDate = LocalDate.parse(projectDeadline, DateTimeFormatter.ISO_DATE);

        if (userDate.isBefore(currentDate)) {
            System.out.println("*Project is past due date*");
        }
    }
}
