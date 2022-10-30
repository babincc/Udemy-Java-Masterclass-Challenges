package test.section5;

import main.section5.Sum3And5Challenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests Sum3And5Challenge.java
 *
 * @author Christian Babin
 * @see Sum3And5Challenge
 */
class Sum3And5ChallengeTest {

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

    @Test
    void testMain() {
        Sum3And5Challenge.main(null);

        String expected = "15\n30\n45\n60\n75\n225";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

}