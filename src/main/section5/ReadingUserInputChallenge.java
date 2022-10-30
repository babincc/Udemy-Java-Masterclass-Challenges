package main.section5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program was written as a solution to Section 5 Item 74 in Tim
 * Buchalka's "Java Programming Masterclass covering Java 11 & Java 17"
 * course on Udemy.
 *
 * @see
 * <a href="https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/10641374#overview">Section 5 Item 74</a>
 *
 * @author Christian Babin
 */
public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        // Ask the user for 10 numbers.
        int[] userNumbers = fetchNumbers(10);

        int sum = 0;

        // Add the user's numbers together.
        for(int number : userNumbers) {
            sum += number;
        }

        System.out.print("The sum of your numbers is " + sum);
    }

    /**
     * This method will ask the user for a certain number of numbers.
     *
     * @param numberOfNumbers How many numbers to get from the user.
     * @return An array of numbers collected from the user.
     */
    private static int[] fetchNumbers(int numberOfNumbers) {
        int[] userNumbers = new int[numberOfNumbers];

        Scanner userIn = new Scanner(System.in);

        // Ask the user for the given amount of numbers.
        for(int i = 0; i < numberOfNumbers; i++) {
            userNumbers[i] = fetchNumber(userIn, i + 1);
        }

        userIn.close();

        return userNumbers;
    }

    /**
     * This method collects a number from the user.
     *
     * @param index This is the number of numbers the program has asked the
     *              user for so far.
     * @return The number the user inputs.
     */
    private static int fetchNumber(Scanner userIn, int index) {
        while(true) {
            System.out.print("Enter number #" + index + ": ");

            int userNumber;

            try {
               userNumber = userIn.nextInt();
               userIn.nextLine();
               return userNumber;
            } catch(InputMismatchException ime) {
                System.out.println("Invalid Number");
                userIn.nextLine();
            } catch(Exception e) {
                System.out.println("Invalid Number!");
                userIn.nextLine();
            }
        }
    }

}
