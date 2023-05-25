package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/remove-element/">remove-element</a>
 */
public class RemoveElement {
    public static void main(String[] args) {
        var executor = new RemoveElementSolution();
        System.out.println(executor.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}

class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
