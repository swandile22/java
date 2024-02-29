package ConditionalsFirstLessonHomework;

import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {

        double randomNum = Math.floor(Math.random() * 3 + 1);
        int newRandomNum = (int) randomNum;

        System.out.println("Please enter a number between 1 and 3");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

//      Winner Moves
        if (userInput == 1 && newRandomNum == 3) {
            System.out.println(newRandomNum);
            System.out.println("Nice one!, you're a winner!");
        }

        if (userInput == 2 && newRandomNum == 1) {
            System.out.println(newRandomNum);
            System.out.println("Nice one!, you're a winner!");
        }

        if (userInput == 3 && newRandomNum == 2) {
            System.out.println(newRandomNum);
            System.out.println("Nice one!, you're a winner!");
        }

//      Loser Moves
        if (userInput == 3 && newRandomNum == 1) {
            System.out.println(newRandomNum);
            System.out.println("You lose!, better luck next time!");
        }

        if (userInput == 1 && newRandomNum == 2) {
            System.out.println(newRandomNum);
            System.out.println("You lose!, better luck next time!");
        }

        if (userInput == 2 && newRandomNum == 3) {
            System.out.println(newRandomNum);
            System.out.println("You lose!, better luck next time!");
        }

//      Draw Move
        if (userInput == newRandomNum) {
            System.out.println(newRandomNum);
            System.out.println("It's a tie!");
        }


    }
}

