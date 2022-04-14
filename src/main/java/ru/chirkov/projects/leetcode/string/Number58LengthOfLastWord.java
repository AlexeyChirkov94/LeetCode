package ru.chirkov.projects.leetcode.string;


/**
 * Program to return the length of the last word in the string
 */
public class Number58LengthOfLastWord {

    public static void main(String[] args){
        System.out.println(lengthOfLastWord("Hello, my friend!"));
    }

    public static int lengthOfLastWord(String s) {

        String[] words = s.split(" ");

        return words[words.length - 1].length();
    }

}
