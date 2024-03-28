package LessonFourInterface;

public class GasGiant implements Planets {

    private String planetName;
    private String gasType;
    private double planetSize;

    public GasGiant(String planetName, String gasType, double planetSize) {
        this.planetName = planetName;
        this.gasType = gasType;
        this.planetSize = planetSize;
    }

    @Override
    public String getPlanetType() {
        return "Gas Giant";
    }

    @Override
    public double getPlanetSize() {
        return planetSize;
    }

    @Override
    public String getFullClassification() {
        String output = "********************";
        output += "\nPlanet Name: " + planetName;
        output += "\nPlanet Type: " + getPlanetType();
        output += "\nHas Life : " + "false";
        output += "\nPlanet Size: " + planetSize;
        output += "\n********************";
        return output;
    }
}
