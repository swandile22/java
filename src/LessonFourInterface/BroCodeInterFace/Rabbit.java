package LessonFourInterface.BroCodeInterFace;

public class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("Rabbit is fleeing from predator");
    }
}
