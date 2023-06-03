package com.nikitov;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">two-sum</a>
 */
public class TwoSum {
    public static void main(String[] args) {
        var executor = new TwoSumSolution();
        System.out.println(Arrays.toString(executor.twoSum(new int[]{2, 7, 11, 15}, 9)));//[0,1]
        System.out.println(Arrays.toString(executor.twoSum(new int[]{3, 2, 4}, 6)));//[1,2]
        System.out.println(Arrays.toString(executor.twoSum(new int[]{3, 3}, 6)));//[0,1]
    }
}

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}