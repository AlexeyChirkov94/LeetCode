package ru.chirkov.projects.leetcode.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Program for checking the correct placement of brackets
 */
public class Number20ValidParentheses {

    public static void main(String[] args){
        System.out.println(isValid("(){}}{"));
        System.out.println(isValid("{()}{[()]}"));
    }

    public static boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        List<Character> openingSymbols = new LinkedList<>(Arrays.asList('(', '{','['));
        List<Character> closingSymbols = new LinkedList<>(Arrays.asList(')', '}' ,']'));
        if (closingSymbols.contains(s.charAt(0))) return false;

        char[] inputSymbols = s.toCharArray();
        Stack<Character> lostToClose = new Stack<>();
        int indexOfOpenedSymbol = 0;


        for (int i = 0; i < s.length(); i++){
            char currentChar = inputSymbols[i];

            if (openingSymbols.contains(currentChar)){
                indexOfOpenedSymbol = openingSymbols.indexOf(currentChar);
                lostToClose.push(currentChar);
            }

            if (closingSymbols.contains(currentChar)){
                if(closingSymbols.indexOf(currentChar) == indexOfOpenedSymbol){
                    lostToClose.pop();
                    indexOfOpenedSymbol = lostToClose.empty()? -1 : openingSymbols.indexOf(lostToClose.peek());
                } else {
                    return false;
                }
            }
        }

        return lostToClose.empty();
    }

}
