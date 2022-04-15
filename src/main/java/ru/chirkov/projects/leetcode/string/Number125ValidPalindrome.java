package ru.chirkov.projects.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class Number125ValidPalindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {

        char[] allSymbols = s.toLowerCase().toCharArray();
        List<Character> letters = new ArrayList<>();

        for (char symbol : allSymbols) {
            if (Character.isLetter(symbol) || Character.isDigit(symbol)) {
                letters.add(symbol);
            }
        }

        for (int i = 0; i < letters.size()/2; i++){
            if (letters.get(i) != letters.get(letters.size() - 1 - i)){
                return false;
            }
        }

        return true;
    }

}
