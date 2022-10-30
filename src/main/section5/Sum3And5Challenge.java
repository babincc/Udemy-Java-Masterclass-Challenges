package main.section5;

/**
 * This program was written as a solution to Section 5 Item 67 in Tim
 * Buchalka's "Java Programming Masterclass covering Java 11 & Java 17"
 * course on Udemy.
 *
 * @see
 * <a href="https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/10261266#overview">Section 5 Item 67</a>
 *
 * @author Christian Babin
 */
public class Sum3And5Challenge {

    /**
     * The goal of this class is to find the first five whole numbers that
     * are divisible by both 3 and 5. Once they are found, print them to the
     * console. Next, add those five numbers together and print their sum to
     * the console.
     */
    public static void main(String[] args) {
        /// This will store the five numbers we are looking for.
        int[] numsThatMeetConditions = new int[5];

        /// This is used to keep track of how many numbers we have found so far.
        int counter = 0;

        // Traverse the whole numbers and try to find five that satisfy the
        // criteria we are searching for. If they can not be found before 1001,
        // stop searching.
        for(int i = 1; i <= 1000 && counter < 5 ; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                numsThatMeetConditions[counter] = i;

                System.out.println(i);

                counter ++;
            }
        }

        int sum = 0;

        // Add our five numbers together.
        for(int num : numsThatMeetConditions) {
            sum += num;
        }

        System.out.print(sum);

    }

}
