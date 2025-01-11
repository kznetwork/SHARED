package com.samsung;

public class FruitRanker {

    public static boolean isValidFruit(String fruit) {
        return fruit != null && !fruit.isEmpty();
    }

    public static boolean isValidRank(int rank) {
        return rank > 0;
    }
}
