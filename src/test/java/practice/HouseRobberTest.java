package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {

    private void tester(int[] houses, int expected) {
        HouseRobber robber = new HouseRobber();        
        int actual = robber.rob(houses);
        assertEquals(expected, actual);
    }
    
    @Test
    void worksWithNoHouse() {
        tester(new int[] {}, 0);
    }

    @Test
    void worksWithOneHouse() {
        tester(new int[] {1}, 1);
    }

    @Test
    void testCaseOne() {
        tester(new int[] {1, 2, 3, 1}, 4);
    }

    @Test
    void testCaseTWo() {
        tester(new int[] {2, 7, 9, 3, 1}, 12);
    }
}
