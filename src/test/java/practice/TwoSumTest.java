package practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    

    @Test
    void findsPair() {
        TwoSum solver = new TwoSum();
        int[] result = solver.solve(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void worksWithNegativeNumbers() {
        TwoSum solver = new TwoSum();
        int[] result = solver.solve(new int[]{-3, 4, 3, 90}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void returnsNotFoundWhenNoSolution() {
        TwoSum solver = new TwoSum();
        int[] result = solver.solve(new int[]{1, 2, 3}, 7);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}
