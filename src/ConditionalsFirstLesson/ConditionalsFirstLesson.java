/*
 * Reserved Keyword - keywords you can't use as variables because they're already in use
 *
 * OOP -
 *
 * Static - states that there should only be one, which doesnt follow OOP principles.
 * In order to follow OOP principles, an object needs to be created, which will have
 * the specific data we're trying to get
 *
 * Primitive and Non-primitive data types
 *
 * Primitive data types don't have methods
 * They are written in lowerCase to identify them as primitive
 *
 * Non-primitive types are objects, and that's why they have methods to change them
 * When data types are written with an uppercase and in full they change from primitive to Non-primitive
 * for e.g int(primitive), Integer(Non-primitive), which is now an object and contains methods
 *
 * Conditionals(if statements)
 * The syntax used in conditionals is if(){} similar to javascript
 * Scanner is an object is used to get user input
 * Before using the Scanner object, it first has to be imported
 * The nextInt class is used with the scanner, it parses an input into the scanner class
 * for e.g int userAge = input.nextInt() - this is going to parse an input into the scanner named input
 *Return - it stops running any additional code and returns back to the beginning
 * When checking String objects, the == doesn't work on strings, instead you use .equals
 * .equalsIgnoreCase compares Strings while ignoring the Lower Case and Upper Case
 * nextLine() works the same as nextInt() but for strings
 */

package ConditionalsFirstLesson;

import java.util.Locale;
import java.util.Scanner;

public class ConditionalsFirstLesson {

    public static void main(String[] args) {
//        /*Primitive*/
//        int userChoice = 0;
//        /*Non-primitive*/
//        String name = "hfgdslkjgfdk";
//        name = name.toUpperCase(Locale.ROOT);
//        System.out.println(name);;


        /*WORKING WITH INTEGERS AND CONDITIONALS*/
//        int reqAge = 18;
//
//        System.out.println("Enter you age: ");
//        Scanner input = new Scanner(System.in);
//        int userAge = input.nextInt();
//        int difference = 18 - userAge;
//
////        System.out.println(userAge);
//        if (userAge >= 18) {
//            System.out.println("You are able to enter!");
//        }
//
//        if (userAge <= 16) {
//            System.out.println("Sorry!, try again after " + difference + " years");
//            return;
//        }
//
//
//        if (userAge == 17) {
//            System.out.println("Sorry!, try again after " + 1 + " year");
//        }

        System.out.println("Enter your name: ");

        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        if (username.equalsIgnoreCase("jeff")) {
            System.out.println("That's correct");
            return;
        }

        System.out.println("Well that was fun");
    }
}

