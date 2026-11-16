package com.isep.lab4;

public class RomanNumeralConverter {

    private static final int[] VALUES = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private static final String[] SYMBOLS = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String convert(int number) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < VALUES.length; index++) {
            while (number >= VALUES[index]) {
                result.append(SYMBOLS[index]);
                number -= VALUES[index];
            }
        }
        return result.toString();
    }
}
