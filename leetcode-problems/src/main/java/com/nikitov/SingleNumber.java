package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/single-number/">single-number</a>
 */
public class SingleNumber {
    public static void main(String[] args) {
        var executor = new SingleNumberSolution();
        System.out.println(executor.singleNumber(new int[]{2, 2, 1}));//1
        System.out.println(executor.singleNumber(new int[]{4, 1, 2, 1, 2}));//4
        System.out.println(executor.singleNumber(new int[]{1, 2, 3, 1, 2, 9, 9, 3, 4}));//4
        System.out.println(executor.singleNumber(new int[]{1}));//1
        System.out.println(executor.singleNumber(new int[]{1, 0, 1}));//0
    }
}

class SingleNumberSolution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

