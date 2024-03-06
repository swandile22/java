/*
* ArrayList<Type> name = new ArrayList<Type>() - [Class]this is used to create a new array list
*
* Scanner input = new Scanner(System.in) - [Class]this is created to take in a user input using(System.in)
*
* int userInput = input.nextInt() - declares the user input in a variable
*
* break - Often used in loops, this is used to terminate a loop and move on to the code following the loop
*
* .add - a method used to add data into a Set or an Array
*
* double - is a datatype that has decimal values and is used in fractional calculations
*
* .size(); - is a method that determines the number of items inside an Array List
*
* += - it is a compound assignment  operator. most commonly used for incrementing the value of a variable since x++
* increments the value by 1(so x += y is the same as x = x + y)
*
*.get(i); - is a method of an ArrayList in Java which is used to get the element of a specified index within the list.
* */

package ConditionalsFirstLessonHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {


        ArrayList<Integer> numbersList = new ArrayList<>(); // creates an array list named numbersList
        while (true) {
            Scanner input = new Scanner(System.in); // creates an input for the user
            int userInput = input.nextInt(); // stores the input into a variable
            if (userInput == 0) {
                break; // if the user input zero than it terminates and moves on to the next code
            }

            numbersList.add(userInput); // adds user input into an array list
        }

        averageSum(numbersList); // calls function
        negativeNum(numbersList); // calls function
        positiveNUm(numbersList); // calls function
    }


    private static double averageSum(ArrayList<Integer> numbersList) {

        int arrayLength = numbersList.size(); // stores the number of items in an array list into the arrayLength var
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += numbersList.get(i); // adds all numbers inside the array and stores the total in sum
        }

        double average = (double) sum / arrayLength; // divides the total by the number of items in the Array
        System.out.println("your average is: " + average);
        return average;
    }

    private static ArrayList<Integer> negativeNum(ArrayList<Integer> numbersList) {

        ArrayList<Integer> negList = new ArrayList<>(); // creates new Array called negList
        int negCount = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            int negNum = numbersList.get(i);
            if (negNum < 0) { // every item retrieved from the numbersList array, it takes the negative ones and
                negList.add(negNum); // adds them to the new array (negList)
            }
        }

//        System.out.println(negList);
        System.out.println("There are " + negList.size() + " negative numbers");
        return negList;
    }

    private static ArrayList<Integer> positiveNUm(ArrayList<Integer> numbersList) {

        ArrayList<Integer> posList = new ArrayList<>(); // creates new Array called posList
        int posCount = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            int posNum = numbersList.get(i);
            if (posNum > 0) { // every item retrieved from the numbersList array, it takes the positive ones and
                posList.add(posNum); // adds them to the new array (posList)
            }
        }

//        System.out.println(posList);
        System.out.println("There are " + posList.size() + " positive numbers");
        return posList;

    }


}


