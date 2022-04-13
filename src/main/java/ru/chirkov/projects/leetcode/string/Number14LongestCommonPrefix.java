package ru.chirkov.projects.leetcode.string;

/**
 * Program to display the maximum common part of words
 */
public class Number14LongestCommonPrefix {

    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"abb","ab","a"}));
    }

    public static String longestCommonPrefix(String[] words){
        if(words.length == 1) return words[0];

        StringBuilder commonPrefix = new StringBuilder();
        String comparableWord = words[0];

        for(int numberComparableLetter = 0; numberComparableLetter < comparableWord.length(); numberComparableLetter++){
            char ch = comparableWord.charAt(numberComparableLetter);

            for (int i = 1; i < words.length; i++){
                if (words[i].length() < numberComparableLetter + 1 || words[i].charAt(numberComparableLetter) != ch){
                    return commonPrefix.toString();
                }
            }

            commonPrefix.append(comparableWord.charAt(numberComparableLetter));
        }

        return commonPrefix.toString();
    }

}
