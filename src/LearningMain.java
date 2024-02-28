import calculate.calculate;
public class LearningMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        calculate myCalc = new calculate(2, 2);
        System.out.println(myCalc.addNum());
    }
}