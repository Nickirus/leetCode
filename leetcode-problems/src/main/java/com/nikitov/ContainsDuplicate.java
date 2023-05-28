package com.nikitov;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">contains-duplicate</a>
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        var executor = new ContainsDuplicateSolution();
        System.out.println(executor.containsDuplicate(new int[]{1, 2, 3, 4}));//false
        System.out.println(executor.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));//true
    }

}

class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }
}
