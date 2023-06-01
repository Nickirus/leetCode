package com.nikitov;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">squares-of-a-sorted-array</a>
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        var executor = new SquaresOfASortedArraySolution();
        System.out.println(Arrays.toString(executor.sortedSquares(new int[]{-4, -1, 0, 3, 10})));//[0,1,9,16,100]
        System.out.println(Arrays.toString(executor.sortedSquares(new int[]{-7, -3, 2, 3, 8, 11})));//[4,9,9,49,64,121]
    }
}

class SquaresOfASortedArraySolution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int indx = nums.length - 1;
        int[] resultNums = new int[nums.length];
        while (indx >= 0) {
            if ( i == j) {
                resultNums[indx] = nums[i] * nums[i];
                indx--;
                continue;
            }
            if (Math.abs(nums[j]) > Math.abs(nums[i])) {
                resultNums[indx] = nums[j] * nums[j];
                j--;
            } else if (Math.abs(nums[j]) < Math.abs(nums[i])) {
                resultNums[indx] = nums[i] * nums[i];
                i++;
            } else {
                resultNums[indx] = resultNums[indx - 1] = nums[i] * nums[i];
                j--;
                i++;
                indx--;
            }
            indx--;
        }
        return resultNums;
    }
}

