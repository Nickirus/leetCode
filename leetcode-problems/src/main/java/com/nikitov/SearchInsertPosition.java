package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/">search-insert-position</a>
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        var executor = new SearchInsertPositionSolution();
        System.out.println(executor.searchInsert(new int[]{1, 3, 5}, 6));
    }
}

class SearchInsertPositionSolution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1 && nums[0] < target) {
            return 1;
        } else if (nums.length > 0) {
            return searchIndex(nums, target, 0, nums.length - 1);
        } else {
            return 0;
        }
    }

    private int searchIndex(int[] nums, int target, int leftBorder, int rightBorder) {
        if (leftBorder < 0) {
            return 0;
        }
        int maxIndex = nums.length - 1;
        if (rightBorder > maxIndex) {
            if (nums[maxIndex] < target) {
                return maxIndex + 1;
            } else {
                rightBorder = maxIndex;
            }
        }
        int i = (rightBorder - leftBorder) / 2 + leftBorder;
        if ((rightBorder - leftBorder) == 1 && nums[i] != target) {
            return nums[leftBorder] < target ? nums[rightBorder] < target ? rightBorder + 1 : rightBorder : leftBorder;
        }
        int currentValue = nums[i];

        if (target > currentValue) {
            return searchIndex(nums, target, Math.min(i + 1, rightBorder), Math.max(i + 1, rightBorder));
        } else if (target < currentValue) {
            return searchIndex(nums, target, Math.min(leftBorder, i - 1), Math.max(leftBorder, i - 1));
        } else {
            return i;
        }
    }
}
