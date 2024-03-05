package ConditionalsFirstLessonHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {


        ArrayList<Integer> numbersList = new ArrayList<>();
        while (true) {
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            if (userInput == 0) {
                break;
            }

            numbersList.add(userInput);
        }

        averageSum(numbersList);
        ArrayList<Integer> negativeNums = negativeNum(numbersList);
    }

    private static double averageSum(ArrayList<Integer> numbersList) {

        int arrayLength = numbersList.size();
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += numbersList.get(i);
        }

        double average = (double) sum / arrayLength;
        System.out.println("your average is: " + average);
        return average;
    }

    private static ArrayList<Integer> negativeNum(ArrayList<Integer> numbersList) {

        ArrayList<Integer> negList = new ArrayList<>();
        int negCount = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            int negNum = numbersList.get(i);
            if (negNum < 0) {
                negList.add(negNum);
            }
        }

        System.out.println(negList);
        System.out.println("There are " + negList.size() + " negative numbers");
        return negList;
    }
}


