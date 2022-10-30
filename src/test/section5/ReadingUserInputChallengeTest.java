package test.section5;

import main.section5.ReadingUserInputChallenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests ReadingUserInputChallenge.java
 *
 * @author Christian Babin
 * @see ReadingUserInputChallenge
 */
class ReadingUserInputChallengeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testNormalInput() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testSomeNegatives() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "-4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "-7" +
                System.getProperty("line.separator") + "-8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 10";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testAllNegatives() {
        String simulatedInput = "-1" + System.getProperty("line.separator") +
                "-2" + System.getProperty("line.separator") + "-3" +
                System.getProperty("line.separator") + "-3" +
                System.getProperty("line.separator") + "-4" +
                System.getProperty("line.separator") + "-5" +
                System.getProperty("line.separator") + "-6" +
                System.getProperty("line.separator") + "-7" +
                System.getProperty("line.separator") + "-8" +
                System.getProperty("line.separator") + "-9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is -48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testSomeZero() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 38";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testAllZero() {
        String simulatedInput = "0" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 0";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testLargeNums() {
        String simulatedInput = "10" + System.getProperty("line.separator") +
                "234" + System.getProperty("line.separator") + "35" +
                System.getProperty("line.separator") + "65" +
                System.getProperty("line.separator") + "-4" +
                System.getProperty("line.separator") + "54" +
                System.getProperty("line.separator") + "60" +
                System.getProperty("line.separator") + "-700" +
                System.getProperty("line.separator") + "-8" +
                System.getProperty("line.separator") + "940" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 686";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testInvalidInputs() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "Hello" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "Hi" +
                System.getProperty("line.separator") + "Howdy" +
                System.getProperty("line.separator") + "7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Invalid Number\nEnter " +
                "number #5: Enter number #6: Enter number #7: Enter number " +
                "#8: Invalid Number\nEnter number #8: Invalid Number\nEnter " +
                "number #8: Enter number #9: Enter number #10: The sum of " +
                "your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testMultiwordInvalidInputs() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "Hello world" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "Hi there" +
                System.getProperty("line.separator") + "Howdy partner" +
                System.getProperty("line.separator") + "7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Invalid Number\nEnter " +
                "number #5: Enter number #6: Enter number #7: Enter number " +
                "#8: Invalid Number\nEnter number #8: Invalid Number\nEnter " +
                "number #8: Enter number #9: Enter number #10: The sum of " +
                "your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testMultipleNumsOneLine() {
        String simulatedInput = "1 2 3" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3 5 4" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5 3 4 3434" +
                System.getProperty("line.separator") + "6 5324 4" +
                System.getProperty("line.separator") + "7 3234" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testMultipleNumsAndFollowedByInvalidInputsOneLine() {
        String simulatedInput = "1 2 3" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3 5 hello 4" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5 3 4 3434" +
                System.getProperty("line.separator") + "6 5324 Howdy 4" +
                System.getProperty("line.separator") + "7 3234" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testInvalidInputsFollowedByValidNumOnOneLine() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "Hello 5" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "Hi 5 33 7" +
                System.getProperty("line.separator") + "Howdy 4" +
                System.getProperty("line.separator") + "7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Invalid Number\nEnter " +
                "number #5: Enter number #6: Enter number #7: Enter number " +
                "#8: Invalid Number\nEnter number #8: Invalid Number\nEnter " +
                "number #8: Enter number #9: Enter number #10: The sum of " +
                "your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testExtraBlankLines() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") +
                System.getProperty("line.separator") +
                System.getProperty("line.separator") +
                System.getProperty("line.separator") +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testExtraBlankSpace_Leading() {
        String simulatedInput = "    1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + " 3" +
                System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + " 5" +
                System.getProperty("line.separator") + "       6" +
                System.getProperty("line.separator") + "   7" +
                System.getProperty("line.separator") + "8" +
                System.getProperty("line.separator") + "  9" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testExtraBlankSpace_Trailing() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3      " +
                System.getProperty("line.separator") + "3  " +
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "6" +
                System.getProperty("line.separator") + "7 " +
                System.getProperty("line.separator") + "8 " +
                System.getProperty("line.separator") + "9      " +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadingUserInputChallenge.main(null);

        String expected = "Enter number #1: Enter number #2: Enter number " +
                "#3: Enter number #4: Enter number #5: Enter number #6: " +
                "Enter number #7: Enter number #8: Enter number #9: Enter " +
                "number #10: The sum of your numbers is 48";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

}