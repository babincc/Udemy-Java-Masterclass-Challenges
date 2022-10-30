package main.section5;

import java.util.Stack;

/**
 * This program was written as a solution to Section 5 Item 70 in Tim
 * Buchalka's "Java Programming Masterclass covering Java 11 & Java 17"
 * course on Udemy.
 *
 * @see
 * <a href="https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/10261272#overview">Section 5 Item 70</a>
 *
 * @author Christian Babin
 */
public class DigitSumChallenge {

    /**
     * This method takes in a number, adds all of its digits together, and
     * returns that sum.
     * <br><br>
     * This method will return -1 if the number is less than 10, since it
     * does not multiple digits to add together.
     *
     * @param num The number whose digits are being added together.
     * @return The sum of all the digits in the given num.
     */
    public static int sumDigits(int num) {
        if(num < 10) {
            return -1;
        }

        int temp = num;
        Stack<Integer> digitStack = new Stack<>();

        // Tear the given num apart into its individual digits.
        while(temp > 0) {
            digitStack.push(temp % 10);
            temp /= 10;
        }

        int sum = 0;

        // Add the digits together
        while (!digitStack.isEmpty()) {
            sum += digitStack.pop();
        }

        return sum;
    }

}
