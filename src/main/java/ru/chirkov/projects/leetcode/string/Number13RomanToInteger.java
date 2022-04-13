package ru.chirkov.projects.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Program for converting Roman numerals to Arabic
 */
public class Number13RomanToInteger {

    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String romanNumeral){
        Map<String, Integer> romanValues = initializeRomanValues();
        int result = 0;
        String currentSymbol = "";

        for (int i = 0; i < romanNumeral.length(); ){
            if (i != romanNumeral.length() - 1){
                currentSymbol = new String(new char[]{romanNumeral.charAt(i), romanNumeral.charAt(i + 1)});
            }
            if (!romanValues.containsKey(currentSymbol)){
                currentSymbol = Character.toString(romanNumeral.charAt(i));
            }
            result += romanValues.get(currentSymbol);
            i += currentSymbol.length();
            currentSymbol = "";
        }

        return result;
    }

    private static Map<String, Integer> initializeRomanValues(){
        Map<String, Integer> values = new HashMap<>();
        values.put("I",1);
        values.put("V",5);
        values.put("X",10);
        values.put("L",50);
        values.put("C",100);
        values.put("D",500);
        values.put("M",1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);

        return values;
    }

}
