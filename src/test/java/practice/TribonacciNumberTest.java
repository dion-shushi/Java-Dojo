package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TribonacciNumberTest {
    @Test
    void testCaseOne() {
        TribonacciNumber number = new TribonacciNumber();
        int actual = number.tribonacci(3);
        assertEquals(2, actual);
    }

    @Test
    void testCaseTwo() {
        TribonacciNumber number = new TribonacciNumber();
        int actual = number.tribonacci(4);
        assertEquals(4, actual);
    }

    @Test
    void testCaseThree() {
        TribonacciNumber number = new TribonacciNumber();
        int actual = number.tribonacci(25);
        assertEquals(1389537, actual);
    }
}
