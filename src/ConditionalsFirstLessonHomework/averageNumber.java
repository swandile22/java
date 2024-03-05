/*
* ArrayList<Type> name = new ArrayList<Type>() - [Class]this is used to create a new array list
* Scanner input = new Scanner(System.in) - [Class]this is created to take in a user input using(System.in)
* int userInput = input.nextInt() - declares the user input in a variable
* break - Often used in loops, this is used to terminate a loop and move on to the code following the loop
* .add - a method used to add data into a Set or an Array
*
* */

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
        negativeNum(numbersList);
        positiveNUm(numbersList);
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

//        System.out.println(negList);
        System.out.println("There are " + negList.size() + " negative numbers");
        return negList;
    }

    private static ArrayList<Integer> positiveNUm(ArrayList<Integer> numbersList) {

        ArrayList<Integer> posList = new ArrayList<>();
        int posCount = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            int posNum = numbersList.get(i);
            if (posNum > 0) {
                posList.add(posNum);
            }
        }

//        System.out.println(posList);
        System.out.println("There are " + posList.size() + " positive numbers");
        return posList;

    }


}


