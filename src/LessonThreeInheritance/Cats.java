package LessonThreeInheritance;

public class Cats {

    private String name;
    private String colour;
    private double size;

    public Cats(String name, String colour, double size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    public void meow() {
        System.out.println("ｍｅｅｅｅｅｏｗ!");
    }

    public void purr() {
        System.out.println("ｐｕｒｒｒｒｒｒｒｒｒｒｒ!");
    }


    public String toString() {
        String output = "********************";
        output += "\nName: " + name;
        output += "\nColour: " + colour;
        output += "\nSize: " + size + "Kg";
        return output;
    }


}
