package test.section5;

import main.section5.MinimumAndMaximumChallenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests MinimumAndMaximumChallenge.java
 *
 * @author Christian Babin
 * @see MinimumAndMaximumChallenge
 */
class MinimumAndMaximumChallengeTest {

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
                System.getProperty("line.separator") + "4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "q" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: Enter number: Enter number: Enter " +
                "number: Enter number: Enter number: Min = 1" +
                System.getProperty("line.separator") + "Max = 5";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testImmediateLetter() {
        String simulatedInput = "q" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: You didn't enter any numbers";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testOneInput() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "q" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: Enter number: Min = 1" +
                System.getProperty("line.separator") + "Max = 1";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testMultipleSameInput() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "1" + System.getProperty("line.separator") + "1" +
                System.getProperty("line.separator") + "1" +
                System.getProperty("line.separator") + "1" +
                System.getProperty("line.separator") + "q" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: Enter number: Enter number: Enter " +
                "number: Enter number: Enter number: Min = 1" +
                System.getProperty("line.separator") + "Max = 1";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testNegativeInput() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "-4" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "q" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: Enter number: Enter number: Enter " +
                "number: Enter number: Enter number: Min = -4" +
                System.getProperty("line.separator") + "Max = 5";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testZeroInput() {
        String simulatedInput = "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3" +
                System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator") + "5" +
                System.getProperty("line.separator") + "q" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: Enter number: Enter number: Enter " +
                "number: Enter number: Enter number: Min = 0" +
                System.getProperty("line.separator") + "Max = 5";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testLargeInput() {
        String simulatedInput = "34" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") + "3442" +
                System.getProperty("line.separator") + "23453" +
                System.getProperty("line.separator") + "9584" +
                System.getProperty("line.separator") + "q" +
                System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MinimumAndMaximumChallenge.main(null);

        String expected = "Enter number: Enter number: Enter number: Enter " +
                "number: Enter number: Enter number: Min = 2" +
                System.getProperty("line.separator") + "Max = 23453";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

}