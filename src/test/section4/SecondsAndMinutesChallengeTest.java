package test.section4;

import main.section4.SecondsAndMinutesChallenge;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests SecondsAndMinutesChallenge.java
 *
 * @author Christian Babin
 * @see SecondsAndMinutesChallenge
 */
class SecondsAndMinutesChallengeTest {

    @Nested
    class getDurationString_minAndSec {

        @Test
        void testAllZeros() {
            String expected = "00h 00m 00s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(0, 0);

            assertEquals(expected, actual);
        }

        @Test
        void testNegativeMin() {
            String expected = "Invalid value";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(-5, 0);

            assertEquals(expected, actual);
        }

        @Test
        void testNegativeSec() {
            String expected = "Invalid value";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(0, -1);

            assertEquals(expected, actual);
        }

        @Test
        void testSingleDigitLeadingZero() {
            String expected = "02h 05m 09s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(125, 9);

            assertEquals(expected, actual);
        }

        @Test
        void testDoubleDigitNoLeadingZero() {
            String expected = "10h 15m 16s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(615, 16);

            assertEquals(expected, actual);
        }

    }

    @Nested
    class getDurationString_secOnly {

        @Test
        void test24Hours() {
            String expected = "24h 00m 00s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(86400);

            assertEquals(expected, actual);
        }

        @Test
        void testNegativeInput() {
            String expected = "Invalid value";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(-78);

            assertEquals(expected, actual);
        }

        @Test
        void testZero() {
            String expected = "00h 00m 00s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(0);

            assertEquals(expected, actual);
        }

        @Test
        void test59h59m59s() {
            String expected = "59h 59m 59s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(215999);

            assertEquals(expected, actual);
        }

        @Test
        void testOver59h() {
            String expected = "72h 35m 18s";
            String actual =
                    SecondsAndMinutesChallenge.getDurationString(261318);

            assertEquals(expected, actual);
        }

    }

}
