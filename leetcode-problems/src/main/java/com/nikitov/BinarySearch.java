package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/binary-search/">binary-search</a>
 */
public class BinarySearch {
    public static void main(String[] args) {
        var executor = new BinarySearchSolution();
        System.out.println(executor.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));//4
        System.out.println(executor.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));//-1
        System.out.println(executor.search(new int[]{2, 5}, 0));//-1
    }
}

class BinarySearchSolution {
    public int search(int[] nums, int target) {
        return search(0, nums.length - 1, nums, target);
    }

    private int search(int startIndex, int endIndex, int[] nums, int target) {
        if (startIndex == endIndex) {
            return nums[endIndex] == target ? endIndex : -1;
        } else {
            int middleIndex = (startIndex + endIndex) / 2;
            if (nums[middleIndex] < target) {
                return search(middleIndex + 1, endIndex, nums, target);
            } else if (nums[middleIndex] > target) {
                return search(startIndex, middleIndex - 1 < 0 ? 0 : middleIndex - 1, nums, target);
            } else {
                return middleIndex;
            }
        }
    }
}
