package com.isep.lab4;

public class RomanNumeralConverter {

    public String convert(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        int remainingNumber = number;

        for (RomanSymbol symbol : RomanSymbol.values()) {
            while (remainingNumber >= symbol.arabicValue) {
                romanNumeral.append(symbol.romanText);
                remainingNumber -= symbol.arabicValue;
            }
        }
        return romanNumeral.toString();
    }

    private enum RomanSymbol {
        THOUSAND(1000, "M"),
        NINE_HUNDRED(900, "CM"),
        FIVE_HUNDRED(500, "D"),
        FOUR_HUNDRED(400, "CD"),
        HUNDRED(100, "C"),
        NINETY(90, "XC"),
        FIFTY(50, "L"),
        FORTY(40, "XL"),
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final int arabicValue;
        private final String romanText;

        RomanSymbol(int arabicValue, String romanText) {
            this.arabicValue = arabicValue;
            this.romanText = romanText;
        }
    }
}
