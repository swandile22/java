package LessonFourInterface.BroCodeInterFace;

public class Fish implements Prey, Predator{
    @Override
    public void flee() {
        System.out.println("Fish is fleeing from bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is hunting for smaller fish");
    }
}
