/*
* *= - is a multiplication compound assignment operator which means a variable is equal to it's current value times
* a new value
*
* Assignment Operators
// =    (e.g):x = 5 	(same as):x = 5

// += 	(e.g):x += 3 	(same as):x = x + 3

// -= 	(e.g):x -= 3 	(same as):x = x - 3

// *= 	(e.g):x *= 3 	(same as):x = x * 3

// /= 	(e.g):x /= 3 	(same as):x = x / 3

// %= 	(e.g):x %= 3 	(same as):x = x % 3

// &= 	(e.g):x &= 3 	(same as):x = x & 3

// |= 	(e.g):x |= 3 	(same as):x = x | 3

// ^= 	(e.g):x ^= 3 	(same as):x = x ^ 3

// >>= (e.g):x >>= 3 	(same as):x = x >> 3

// <<= (e.g):x <<= 3 	(same as):x = x << 3
* */

package ConditionalsFirstLessonHomework;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        factorialNum();
    }

    private static void factorialNum() {

        System.out.println("Please enter any positive number");
        int fact = 1;
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput < 0) {
            System.out.println("Oops!, that's not a positive number");
            return;
        }

        for (int i = 1; i <= userInput; i++) {
            fact *= i;

        }

        System.out.println(fact);
    }
}
