package test.section5;

import main.section5.DigitSumChallenge;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests DigitSumChallenge.java
 *
 * @author Christian Babin
 * @see DigitSumChallenge
 */
class DigitSumChallengeTest {

    @Nested
    class sumDigits {

        @Nested
        class testSingleDigitInput {

            @Test
            void testNegativeInput () {
                int expected = -1;
                int actual = DigitSumChallenge.sumDigits(-3);

                assertEquals(expected, actual);
            }

            @Test
            void testZero () {
                int expected = -1;
                int actual = DigitSumChallenge.sumDigits(0);

                assertEquals(expected, actual);
            }

            @Test
            void testPositiveInput () {
                int expected = -1;
                int actual = DigitSumChallenge.sumDigits(7);

                assertEquals(expected, actual);
            }

        }

        @Nested
        class testDoubleDigitInput {

            @Test
            void testNegativeInput () {
                int expected = -1;
                int actual = DigitSumChallenge.sumDigits(-46);

                assertEquals(expected, actual);
            }

            @Test
            void testPositiveInput () {
                int expected = 14;
                int actual = DigitSumChallenge.sumDigits(95);

                assertEquals(expected, actual);
            }

        }

        @Nested
        class testTripleDigitInput {

            @Test
            void testNegativeInput () {
                int expected = -1;
                int actual = DigitSumChallenge.sumDigits(-152);

                assertEquals(expected, actual);
            }

            @Test
            void testPositiveInput () {
                int expected = 12;
                int actual = DigitSumChallenge.sumDigits(624);

                assertEquals(expected, actual);
            }

        }

        @Nested
        class testQuadrupleDigitInput {

            @Test
            void testNegativeInput () {
                int expected = -1;
                int actual = DigitSumChallenge.sumDigits(-8256);

                assertEquals(expected, actual);
            }

            @Test
            void testPositiveInput () {
                int expected = 24;
                int actual = DigitSumChallenge.sumDigits(2958);

                assertEquals(expected, actual);
            }

        }

        @Test
        void testValidInputContainingZero() {
            int expected = 5;
            int actual = DigitSumChallenge.sumDigits(50);

            assertEquals(expected, actual);
        }

        @Test
        void testInputMadeOfSameNumberRepeated() {
            int expected = 12;
            int actual = DigitSumChallenge.sumDigits(444);

            assertEquals(expected, actual);
        }

        @Test
        void testMultiZero() {
            int expected = -1;
            int actual = DigitSumChallenge.sumDigits(000);

            assertEquals(expected, actual);
        }

        @Test
        void testNumbersInOrder() {
            int expected = 6;
            int actual = DigitSumChallenge.sumDigits(123);

            assertEquals(expected, actual);
        }

        @Test
        void testNumbersInReverseOrder() {
            int expected = 18;
            int actual = DigitSumChallenge.sumDigits(765);

            assertEquals(expected, actual);
        }

        @Test
        void testMultiZeroPalindromeInput() {
            int expected = 6;
            int actual = DigitSumChallenge.sumDigits(30003);

            assertEquals(expected, actual);
        }

    }
}