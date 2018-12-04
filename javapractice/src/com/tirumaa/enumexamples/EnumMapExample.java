package com.tirumaa.enumexamples;

import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Color,Integer> enumIntegerEnumMap = new EnumMap<>(Color.class);
        enumIntegerEnumMap.put(Color.BLUE,1);
        enumIntegerEnumMap.put(Color.GREEN,2);
        enumIntegerEnumMap.put(Color.RED,3);
    }
}
