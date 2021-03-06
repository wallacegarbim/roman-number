package com.app;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {

    private static final Map<String, Integer> romanNumbersMap = new HashMap<>();

    static {
        initRomanNumbersMap();
    }

    public int convert(String romanNumber) {

        int previousNumber;
        int actualNumber = 0;
        int result = 0;

        for(int i = 0; i < romanNumber.length(); i++){
            previousNumber = actualNumber;
            actualNumber = romanNumbersMap.get(String.valueOf(romanNumber.charAt(i)));
            result = buildRomanNumber(previousNumber, actualNumber, result, String.valueOf(romanNumber.charAt(i)));
        }
        return result;
    }

    private int buildRomanNumber(int previousNumber, int actualNumber, int result, String s) {
        if(actualNumber > previousNumber){
            result += romanNumbersMap.get(s) - (2 * previousNumber);
        }else {
            result += romanNumbersMap.get(s);
        }
        return result;
    }

    private static void initRomanNumbersMap(){
        romanNumbersMap.put("I", 1);
        romanNumbersMap.put("V", 5);
        romanNumbersMap.put("X", 10);
        romanNumbersMap.put("L", 50);
        romanNumbersMap.put("C", 100);
        romanNumbersMap.put("D", 500);
        romanNumbersMap.put("M", 1000);
    }
}
