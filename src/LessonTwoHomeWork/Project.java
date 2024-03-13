package LessonTwoHomeWork;


import java.math.BigDecimal;

public class Project {

    private int number;

    private String name;

    private String building;

    private String address;

    private int ERF;

    private BigDecimal totalCharge;

    private BigDecimal paidToDate;

    private String deadline;


    public Project(int number, String name, String building, String address,
                   int ERF, BigDecimal totalCharge, BigDecimal paidToDate, String deadline) {
        this.number = number;
        this.name = name;
        this.building = building;
        this.address = address;
        this.ERF = ERF;
        this.totalCharge = totalCharge;
        this.paidToDate = paidToDate;
        this.deadline = deadline;
    }

    public int getNumber() { return number;}
    public void setNumber(int number) { this.number = number;}


    public String getName() { return name;}
    public void setName(String name) { this.name = address;}


    public String getBuilding() { return building;}
    public void setBuilding(String building) { this.building = building;}


    public String getAddress() { return address;}
    public void setAddress(String address) { this.address = address;}


    public int getERF() { return ERF;}
    public void setERF(int ERF) { this.ERF = ERF;}


    public BigDecimal getTotalCharge() { return totalCharge;}
    public void setTotalCharge(BigDecimal totalCharge) { this.totalCharge = totalCharge;}


    public BigDecimal getPaidToDate() { return paidToDate;}
    public void setPaidToDate(BigDecimal paidToDate) { this.paidToDate = paidToDate;}


    public String getDeadline() { return deadline;}
    public void setDeadline(String deadline) { this.deadline = deadline;}



    @Override
    public String toString() {
        String output = "***********************************";
        output += "\nProject Number:" + " " + number;
        output += "\nProject Name:" + " " + name;
        output += "\nBuilding Type:" + " " + building;
        output += "\nProject Address:" + " " + address;
        output += "\nERF Number:" + " " + ERF;
        output += "\nTotal Charge Fee:" + " " + totalCharge;
        output += "\nAmount Paid to Date:" + " " + "R" +paidToDate;
        output += "\nProject Deadline:" + " " + "R" + deadline;
        output += "\n***********************************";
        return output;

    }

}
