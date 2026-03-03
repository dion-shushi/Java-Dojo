package practice;

import java.util.HashMap;

public class MinCostClimbingStairs {
    private final HashMap<Integer, Integer> memo = new HashMap<>();
    private int[] cost;

    private int dp(int i) {
        if (i <= 1) return 0;

        if (!memo.containsKey(i)) {
            int downOne = this.cost[i - 1] + dp(i - 1);
            int downTwo = this.cost[i - 2] + dp(i - 2);

            memo.put(i, Math.min(downOne, downTwo));
        }

        return memo.get(i);
    }

    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;

        return dp(cost.length);
    }
}
