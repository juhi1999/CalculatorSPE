import static org.junit.Assert.*;
import org.junit.Test;
import org.example.Calculator;
public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.factorial(6), DELTA);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 69, calculator.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for True Negative", 42, calculator.factorial(10), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 32, calculator.power(2, 5), DELTA);
        assertEquals("Finding power for True Positive", 81, calculator.power(9, 2), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 69, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for True Negative", -69420, calculator.power(-2, 20), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 5.703782474656201, calculator.naturalLog(300), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for True Negative", 420, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 11, calculator.squareRoot(121), DELTA);
        assertEquals("Finding square root for True Positive", 121, calculator.squareRoot(14641), DELTA);
    }

    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 69, calculator.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for True Negative", -42, calculator.squareRoot(4), DELTA);
    }


}
