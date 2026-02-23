package practice;

import java.util.HashMap;

public class HouseRobber {
    private HashMap<Integer, Integer> memo = new HashMap<>();
    private int[] houses;

    private int robbingLogic(int currentHouse) {
        if (currentHouse == 0) return houses[currentHouse];
        if (currentHouse == 1) return Math.max(houses[0], houses[1]);

        if (!memo.containsKey(currentHouse)){
            memo.put(currentHouse, Math.max(robbingLogic(currentHouse - 1), robbingLogic(currentHouse - 2) + houses[currentHouse]));
        }

        return memo.get(currentHouse);
    }

    public int rob(int[] houses) {
        this.houses = houses;
        int numberOfHouses = houses.length;

        if (numberOfHouses == 0) return 0;

        return robbingLogic(numberOfHouses - 1);
    }
}
