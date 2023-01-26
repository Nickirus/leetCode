package com.nikitov;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">remove-duplicates-from-sorted-array</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        var executor = new RemoveDuplicatesFromSortedArraySolution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(nums));
        System.out.println(executor.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}

class RemoveDuplicatesFromSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (i != j && nums[i] == nums[j] && nums[j] != Integer.MIN_VALUE) {
                    nums[j] = Integer.MIN_VALUE;
                    k++;
                }
                if (j - 1 >= 0 && nums[j - 1] == Integer.MIN_VALUE) {
                    nums[j - 1] = nums[j];
                    nums[j] = Integer.MIN_VALUE;
                }
            }
        }

        return nums.length - k;
    }
}
