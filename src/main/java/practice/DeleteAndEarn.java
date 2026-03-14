package practice;

import java.util.HashMap;

public class DeleteAndEarn {

    HashMap<Integer, Integer> possiblePoints = new HashMap<>();
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int maxPoints(int num) {
        if (num == 0) return 0;
        if (num == 1) return possiblePoints.getOrDefault(num, 0);

        if (!cache.containsKey(num)) {
            cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + possiblePoints.getOrDefault(num, 0)));
        }

        return cache.get(num);
    }

    public int deleteAndEarn(int[] nums) {
        int maxNum = 0;

        for (int num : nums){
            possiblePoints.put(num, possiblePoints.getOrDefault(num, 0) + num);
            maxNum = Math.max(maxNum, num);
        }

        return maxPoints(maxNum);
    }
}
