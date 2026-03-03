package practice;

import java.util.HashMap;

public class TribonacciNumber {
    private final HashMap<Integer, Integer> memo = new HashMap<>();

    private int dp(int i) {
        if (i == 0) return 0;
        if (i == 1 || i == 2) return 1;
        
        if (!memo.containsKey(i)) {
            int total = dp(i - 1) + dp(i - 2) + dp(i - 3);

            memo.put(i, total);
        }

        return memo.get(i);

    }

    public int tribonacci(int n) {
        return dp(n);
    }
}
