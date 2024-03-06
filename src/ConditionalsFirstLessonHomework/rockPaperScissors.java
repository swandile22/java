/*
* Math.floor rounds down the specified value
*
* Math.random - returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0
*
* (int) randomNum - this converts the specified value into an integer
*
*Scanner input = new Scanner(System.in); - creates an input to capture from the user
*
* int userInput = input.nextInt(); - stores the user's input inside of a variable called userInput
 *
*/

package ConditionalsFirstLessonHomework;

import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {

        rockPaperScissorsProg();
    }

    private static void rockPaperScissorsProg() {

        //      Random number
        double randomNum = Math.floor(Math.random() * 3 + 1); // Creates random number that is >= 1 but <= 3
        int newRandomNum = (int) randomNum; // stores generated random number inside newRandomNum variable

//      User input
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");
        Scanner input = new Scanner(System.in); // Scanner for user to input data
        int userInput = input.nextInt(); // stores user data inside userInput variable

//      Conditionals
        if (userInput < 1 || userInput > 3){
            System.out.println("Invalid value");return; // stops running code if user input is < 1 and > 3
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

