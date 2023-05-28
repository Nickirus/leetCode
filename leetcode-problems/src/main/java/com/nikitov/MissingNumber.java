package com.nikitov;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/missing-number/">missing-number</a>
 */
public class MissingNumber {
    public static void main(String[] args) {
        var executor = new MissingNumberSolution();
        System.out.println(executor.missingNumber(new int[]{3, 0, 1}));//2
        System.out.println(executor.missingNumber(new int[]{0, 1}));//2
        System.out.println(executor.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));//8
        System.out.println(executor.missingNumber(new int[]{1}));//0
    }

}

class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] - nums[i] > 1) {
                return nums[i] + 1;
            } else if (nums[0] == 0 && i + 1 == nums.length) {
                return nums[i] + 1;
            }
        }
        return nums[0] == 0 ? nums[0] + 1 : 0;
    }
}
