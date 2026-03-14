package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DeleteAndEarnTest {
    @Test
    void testCaseOne() {
        DeleteAndEarn operation = new DeleteAndEarn();
        int actual = operation.deleteAndEarn(new int[] {3, 4, 2});
        assertEquals(6, actual);
    }

    @Test
    void testCaseTwo() {
        DeleteAndEarn operation = new DeleteAndEarn();
        int actual = operation.deleteAndEarn(new int[] {2,2,3,3,3,4});
        assertEquals(9, actual);
    }
}
