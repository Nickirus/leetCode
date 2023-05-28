package com.nikitov;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate-ii/">contains-duplicate-ii</a>
 */
public class ContainsDuplicateII {
    public static void main(String[] args) {
        var executor = new ContainsDuplicateIISolution();
        System.out.println(executor.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));//true
        System.out.println(executor.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));//true
        System.out.println(executor.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));//false
    }

}

class ContainsDuplicateIISolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j - i <= k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * O(n)
     */
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int indexOfExistedItem = map.get(nums[i]);
                if (i - indexOfExistedItem <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
