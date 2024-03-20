package LessonTwoHomeWork;


import java.math.BigDecimal;
import java.util.Scanner;

public class Project {

    private int projectNumber;

    private String projectName;

    private String buildingType;

    private String projectAddress;

    private int ERFNumber;

    private BigDecimal totalChargeFee;

    private BigDecimal amountPaidToDate;

    private String projectDeadline;


    public Project(int projectNumber, String projectName, String buildingType, String projectAddress,
                   int ERFNumber, BigDecimal totalChargeFee, BigDecimal amountPaidToDate, String projectDeadline) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.projectAddress = projectAddress;
        this.ERFNumber = ERFNumber;
        this.totalChargeFee = totalChargeFee;
        this.amountPaidToDate = amountPaidToDate;
        this.projectDeadline = projectDeadline;
    }

    public Project() {

    }


    public int getProjectNumber() { return projectNumber;}
    public void setProjectNumber(int projectNumber) { this.projectNumber = projectNumber;}


    public String getProjectName() { return projectName;}
    public String setProjectName(String projectName) { this.projectName = projectName;
        return projectName;
    }


    public String getBuildingType() { return buildingType;}
    public void setBuildingType(String buildingType) { this.buildingType = buildingType;}


    public String getProjectAddress() { return projectAddress;}
    public void setProjectAddress(String projectAddress) { this.projectAddress = projectAddress;}


    public int getERFNumber() { return ERFNumber;}
    public void setERFNumber(int ERFNumber) { this.ERFNumber = ERFNumber;}


    public BigDecimal getTotalChargeFee() { return totalChargeFee;}
    public void setTotalChargeFee(BigDecimal totalChargeFee) { this.totalChargeFee = totalChargeFee;}


    public BigDecimal getAmountPaidToDate() { return amountPaidToDate;}
    public void setAmountPaidToDate(BigDecimal amountPaidToDate) { this.amountPaidToDate = amountPaidToDate;}


    public String getProjectDeadline() { return projectDeadline;}
    public void setProjectDeadline(String projectDeadline) { this.projectDeadline = projectDeadline;}



    @Override
    public String toString() {
        String output = "***********************************";
        output += "\nProject Number:" + " " + projectNumber;
        output += "\nProject Name:" + " " + projectName;
        output += "\nBuilding Type:" + " " + buildingType;
        output += "\nProject Address:" + " " + projectAddress;
        output += "\nERF Number:" + " " + ERFNumber;
        output += "\nTotal Charge Fee:" + " " + "R" + totalChargeFee;
        output += "\nAmount Paid to Date:" + " " + "R" + amountPaidToDate;
        output += "\nProject Deadline:" + " " + projectDeadline;
        output += "\n***********************************";
        return output;

    }


    public Project projectFunction() {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the following project information," +
                " " + "Type " + "done" + " " + "to finish.");

        Project clearWater = null;

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
            System.out.print("Total charge fee: ");
            BigDecimal totalChargeFee = input.nextBigDecimal();
            System.out.print("Amount paid to date: ");
            BigDecimal amountPaidToDate = input.nextBigDecimal();
            input.nextLine();
            System.out.print("Deadline: ");
            String projectDeadline = input.nextLine();
            System.out.print("Enter 'done' to finish or press Enter to continue: ");
            String userInput = input.nextLine();


            if (userInput.equalsIgnoreCase("done")) {
               this.projectNumber = projectNumber;
                        this.projectName = projectName;
                        this.buildingType = buildingType;
                        this.projectAddress = projectAddress;
                        this.ERFNumber = ERFNumber;
                        this.totalChargeFee = totalChargeFee;
                        this.amountPaidToDate = amountPaidToDate;
                        this.projectDeadline = projectDeadline;

                break;
            }
        }

        return clearWater;
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

    public void repAmount(BigDecimal newTotalChargeFee, BigDecimal newAmountPaidToDate) {
        this.totalChargeFee = newTotalChargeFee;
        this.amountPaidToDate = newAmountPaidToDate;
    }

    public void repDeadline(String newDeadline) {
        this.projectDeadline = newDeadline;
    }

    public void addProjectName(String projectName) {
        this.projectName = "House";
    }


}
