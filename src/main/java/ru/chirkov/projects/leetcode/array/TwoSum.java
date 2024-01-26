package ru.chirkov.projects.leetcode.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, -2, -3, -4, -5}, -8)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            int firstNumber = nums[i];
            for(int j = i+1; j < nums.length; j++){
                int secondNumber = nums[j];
                if (firstNumber + secondNumber == target){
                    int[] answ = new int[]{i, j};
                    return answ;
                }
            }
        }
        throw new RuntimeException("no solution");
    }
}
