package com.nikitov;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @see <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">find-all-numbers-disappeared-in-an-array</a>
 */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        var executor = new FindAllNumbersDisappearedInAnArraySolution();
        System.out.println(executor.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));//[5,6]
        System.out.println(executor.findDisappearedNumbers(new int[]{1, 1}));//[2]
    }
}

class FindAllNumbersDisappearedInAnArraySolution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return IntStream.rangeClosed(1, nums.length)
                .filter(e -> !set.contains(e))
                .boxed()
                .collect(Collectors.toList());
    }
}

