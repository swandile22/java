/*
* Interface = A template that can be applied to a class. Similar to Inheritance, but specifies what a class has or
* must do.
* Classes can apply to more than one interface but inheritance is only limited to one super
* */
package LessonFourInterface.BroCodeInterFace;

public class BroCodeInterfaceMain {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Hawk hawk = new Hawk();

        Prey preyRabbit = (Prey) rabbit;
        Prey preyFish = (Prey) fish;
        Predator predatorFish = (Predator) fish;
        Predator predatorHawk = (Predator) hawk;

        if (rabbit instanceof Prey) {
            rabbit.flee();
        }

        if (fish instanceof Prey) {
            fish.flee();
        }

        if (fish instanceof Predator) {
            fish.hunt();
        }

        if (hawk instanceof Predator) {
            hawk.hunt();
        }

    }
}
