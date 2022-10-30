package main.section4;

/**
 * This program was written as a solution to Section 4 Item 60 in Tim
 * Buchalka's "Java Programming Masterclass covering Java 11 & Java 17"
 * course on Udemy.
 *
 * @see
 * <a href="https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/10261242#overview">Section 4 Item 60</a>
 *
 * @author Christian Babin
 */
public class SecondsAndMinutesChallenge {

    /// The message that is shown if an invalid input is used.
    private static final String ERROR_MSG_INVALID_INPUT = "Invalid value";

    /**
     * This method displays a duration of seconds as a string.
     *
     * @param minutes The duration in minutes.
     * @param seconds The duration in seconds.
     * @return Minutes and seconds in the form of "XXh YYm ZZs".
     */
    public static String getDurationString(int minutes, int seconds) {
        if(!isValidMinutes(minutes) || !isValidSeconds(seconds)) {
            return ERROR_MSG_INVALID_INPUT;
        }

        int[] hoursAndMinutes = minutesToHours(minutes);

        return intAsString(hoursAndMinutes[0], 2) + "h " +
                intAsString(hoursAndMinutes[1], 2) + "m " +
                intAsString(seconds, 2) + "s";
    }

    /**
     * This method displays a duration of seconds as a string.
     *
     * @param seconds The duration in seconds.
     * @return Seconds in the form of "XXh YYm ZZs".
     */
    public static String getDurationString(int seconds) {
        if(!isValidSeconds(seconds, false)) {
            return ERROR_MSG_INVALID_INPUT;
        }

        int[] minutesAndSeconds = secondsToMinutes(seconds);

        return getDurationString(minutesAndSeconds[0], minutesAndSeconds[1]);
    }

    /**
     * This method checks to see if an input counts as a valid number of
     * minutes.
     *
     * @param minutes The input being checked to see if it is a valid number
     *                of minutes.
     * @return True if the input is a valid number of minutes.
     */
    private static boolean isValidMinutes(int minutes) {
        return minutes >= 0;
    }

    /**
     * This method checks to see if an input counts as a valid number of
     * seconds.
     *
     * @param seconds The input being checked to see if it is a valid number
     *                of seconds.
     * @return True if the input is a valid number of seconds.
     */
    private static boolean isValidSeconds(int seconds) {
        return seconds >= 0 && seconds < 60;
    }

    /**
     * This method checks to see if an input counts as a valid number of
     * seconds.
     *
     * @param seconds The input being checked to see if it is a valid number
     *                of seconds.
     * @param capAt59 True if the seconds must be <= 59.
     * @return True if the input is a valid number of seconds.
     */
    private static boolean isValidSeconds(int seconds, boolean capAt59) {
        if(capAt59) {
            return isValidSeconds(seconds);
        } else {
            return isValidMinutes(seconds);
        }
    }

    /**
     * This method converts seconds to minutes and seconds.
     *
     * @param seconds The amount of seconds being converted to minutes and
     *                seconds.
     * @return Seconds as an array of minutes and seconds. Array element 0 is
     * minutes and element 1 is seconds.
     */
    private static int[] secondsToMinutes(int seconds) {
        int[] toReturn = new int[2];

        toReturn[0] = seconds / 60;
        toReturn[1] = seconds % 60;

        return toReturn;
    }

    /**
     * This method converts minutes to hours and minutes.
     *
     * @param minutes The amount of minutes being converted to hours and
     *                minutes.
     * @return Minutes as an array of hours and minutes. Array element 0 is
     * hours and element 1 is minutes.
     */
    private static int[] minutesToHours(int minutes) {
        return secondsToMinutes(minutes);
    }

    /**
     * This method converts a number to a string. It will create the string
     * with the proper number of digits.
     *
     * @param num The number being converted to a string.
     * @param displayDigits How many characters should be in the string.
     * @return A string representation of the given number.
     */
    private static String intAsString(int num, int displayDigits) {
        String numStr = String.valueOf(num);

        if(numStr.length() >= displayDigits ) {
            return numStr;
        } else {
            String leadingZeros = "0" + "0".repeat(
                    Math.max(0, displayDigits - (numStr.length() + 1)));

            return leadingZeros + numStr;
        }
    }

}
