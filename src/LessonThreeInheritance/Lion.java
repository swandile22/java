package LessonThreeInheritance;

public class Lion extends Cats {

    private final boolean mane;
    public Lion(String name, String colour, double size, boolean mane) {
        super(name, colour, size);
        this.mane = mane;
    }
    @Override
    public void meow() {
        System.out.println("\uD835\uDCE1\uD835\uDCDE\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCD0\uD835\uDCE1!!!!!!");
    }
    public void purr() {
        System.out.println("\uD835\uDCDF\uD835\uDCE4\uD835\uDCE1\uD835\uDCE1\uD835\uDCE1\uD835\uDCE1\uD835\uDCE1\uD835\uDCE1\uD835\uDCE1\uD835\uDCE1!!!!!!");
    }


}

