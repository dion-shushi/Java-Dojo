package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTest {
    @Test
    void testCaseOne() {
        MinCostClimbingStairs stairs = new MinCostClimbingStairs();
        int actual = stairs.minCostClimbingStairs(new int[] {10, 15, 20});

        assertEquals(15, actual);
    }

    @Test
    void testCaseTwo() {
        MinCostClimbingStairs stairs = new MinCostClimbingStairs();
        int actual = stairs.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1});

        assertEquals(6, actual);
    }
}
