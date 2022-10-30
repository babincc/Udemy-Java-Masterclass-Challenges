package test.section5;

import main.section5.DayOfTheWeekChallenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests DayOfTheWeekChallenge.java
 *
 * @author Christian Babin
 * @see DayOfTheWeekChallenge
 */
class DayOfTheWeekChallengeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Nested
    class printDayOfTheWeek {

        @Test
        void testNegativeInput() {
            DayOfTheWeekChallenge.printDayOfTheWeek(-1);

            String expected = "Invalid day";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testSunday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(0);

            String expected = "Sunday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testMonday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(1);

            String expected = "Monday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testTuesday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(2);

            String expected = "Tuesday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testWednesday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(3);

            String expected = "Wednesday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testThursday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(4);

            String expected = "Thursday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testFriday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(5);

            String expected = "Friday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testSaturday() {
            DayOfTheWeekChallenge.printDayOfTheWeek(6);

            String expected = "Saturday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testNumberTooHigh() {
            DayOfTheWeekChallenge.printDayOfTheWeek(7);

            String expected = "Invalid day";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

    }

    @Nested
    class printDayOfTheWeek_inefficient {

        @Test
        void testNegativeInput() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(-1);

            String expected = "Invalid day";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testSunday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(0);

            String expected = "Sunday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testMonday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(1);

            String expected = "Monday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testTuesday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(2);

            String expected = "Tuesday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testWednesday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(3);

            String expected = "Wednesday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testThursday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(4);

            String expected = "Thursday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testFriday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(5);

            String expected = "Friday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testSaturday() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(6);

            String expected = "Saturday";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

        @Test
        void testNumberTooHigh() {
            DayOfTheWeekChallenge.printDayOfTheWeek_inefficient(7);

            String expected = "Invalid day";
            String actual = outContent.toString();

            assertEquals(expected, actual);
        }

    }

}