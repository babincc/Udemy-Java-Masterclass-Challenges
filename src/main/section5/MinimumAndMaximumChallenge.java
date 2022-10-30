package main.section5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program was written as a solution to Section 5 Item 75 in Tim
 * Buchalka's "Java Programming Masterclass covering Java 11 & Java 17"
 * course on Udemy.
 *
 * @see
 * <a href="https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/10641378#overview">Section 5 Item 75</a>
 *
 * @author Christian Babin
 */
public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {
        ArrayList<Integer> userNumbers = fetchNumbers();

        if(userNumbers.isEmpty()){
            System.out.print("You didn't enter any numbers");
        } else {
            int min = userNumbers.get(0);
            int max = userNumbers.get(0);

            for(int number : userNumbers) {
                if(number < min) {
                    min = number;
                }

                if(number > max) {
                    max = number;
                }
            }

            System.out.print("Min = " + min + "\nMax = " + max);
        }
    }

    /**
     * This method will ask the user for a certain number of numbers.
     *
     * @return An array of numbers collected from the user.
     */
    private static ArrayList<Integer> fetchNumbers() {
        ArrayList<Integer> userNumbers = new ArrayList<>();

        Scanner userIn = new Scanner(System.in);

        // Ask the user for the given amount of numbers.
        while(true) {
            System.out.print("Enter number: ");

            int userNumber;

            try {
                userNumber = userIn.nextInt();
                userIn.nextLine();
                userNumbers.add(userNumber);
            } catch(Exception e) {
                break;
            }
        }

        userIn.close();

        return userNumbers;
    }

}
