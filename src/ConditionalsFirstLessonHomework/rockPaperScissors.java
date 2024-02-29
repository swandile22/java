package ConditionalsFirstLessonHomework;

import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {

//      Random number
        double randomNum = Math.floor(Math.random() * 3 + 1);
        int newRandomNum = (int) randomNum;

//      User input
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

//      Conditionals
        if (userInput < 1 || userInput > 3){
            System.out.println("Invalid value");return;
        }

        if (userInput == newRandomNum) {
            System.out.println("Computer chose: " + newRandomNum);
            System.out.println("It's a tie!");
        } else if ((userInput == 1 && newRandomNum == 3) ||
                (userInput == 2 && newRandomNum == 1) ||
                (userInput == 3 && newRandomNum == 2)) {
            System.out.println("Computer chose: " + newRandomNum);
            System.out.println("Congratulation! You win!");
        } else {
            System.out.println("Computer chose: " + newRandomNum);
            System.out.println("Sorry, you lose!, better luck next time!");
        }


    }
}

