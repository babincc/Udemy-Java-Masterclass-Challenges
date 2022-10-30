package main.section5;

/**
 * This program was written as a solution to Section 5 Item 64 in Tim
 * Buchalka's "Java Programming Masterclass covering Java 11 & Java 17"
 * course on Udemy.
 *
 * @see
 * <a href="https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/10261248#overview">Section 5 Item 64</a>
 *
 * @author Christian Babin
 */
public class DayOfTheWeekChallenge {

    /**
     * This method takes in a number and prints out the day of the week that
     * corresponds to that number.
     * <br><br>
     * This method will print "Invalid day" if the number is not between 0
     * and 6 (inclusive).
     *
     * @param day The day of the week as a number.
     */
    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid day");
        }
    }


    /**
     * This method takes in a number and prints out the day of the week that
     * corresponds to that number.
     * <br><br>
     * This method will print "Invalid day" if the number is not between 0
     * and 6 (inclusive).
     *
     * @param day The day of the week as a number.
     *
     * @deprecated Use {@link #printDayOfTheWeek(int)} instead
     */
    @Deprecated
    public static void printDayOfTheWeek_inefficient(int day) {
        if(day == 0) {
            System.out.print("Sunday");
        } else if(day == 1) {
            System.out.print("Monday");
        } else if(day == 2) {
            System.out.print("Tuesday");
        } else if(day == 3) {
            System.out.print("Wednesday");
        } else if(day == 4) {
            System.out.print("Thursday");
        } else if(day == 5) {
            System.out.print("Friday");
        } else if(day == 6) {
            System.out.print("Saturday");
        } else {
            System.out.print("Invalid day");
        }
    }

}
