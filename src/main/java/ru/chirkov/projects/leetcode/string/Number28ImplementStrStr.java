package ru.chirkov.projects.leetcode.string;

/**
 * Program to find the index of the first occurrence of needle in haystack
 */
public class Number28ImplementStrStr {

    public static void main(String[] args){
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaa", "aaaa"));
    }

    public static int strStr(String haystack, String needle) {
        int result = -1;

        for (int i = 0; i < haystack.length(); i++ ){
            if (haystack.charAt(i) == needle.charAt(0)){
                result = checkResult(haystack, needle, i);

                if (result != -1){
                    return result;
                }
            }
        }

        return result;
    }

    private static int checkResult(String haystack, String needle, int presumptiveIndexOfOccurrence){
        int j = 0;

        for (int i = presumptiveIndexOfOccurrence; i < haystack.length() && j < needle.length(); i++ ){
            if (haystack.charAt(i) != needle.charAt(j)) return -1;
            j++;
        }
        if (needle.length() + presumptiveIndexOfOccurrence > haystack.length()) return -1;

        return presumptiveIndexOfOccurrence;
    }

}
