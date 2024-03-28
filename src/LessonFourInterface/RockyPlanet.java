package LessonFourInterface;

public class RockyPlanet implements Planets {

    private String planetName;
    private boolean hasLife;
    private double planetSize;

    public RockyPlanet(String planetName, boolean hasLife, double planetSize) {
        this.planetName = planetName;
        this.hasLife = hasLife;
        this.planetSize = planetSize;
    }


    @Override
    public String getPlanetType() {
        return "Rocky Planet";
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
        output += "\nHas Life : " + hasLife;
        output += "\nPlanet Size: " + planetSize;
        output += "\n********************";
        return output;
    }
}
