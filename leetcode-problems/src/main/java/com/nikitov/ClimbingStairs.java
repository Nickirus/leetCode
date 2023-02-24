package com.nikitov;

import java.math.BigInteger;

/**
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">climbing-stairs</a>
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        var executor = new ClimbingStairsSolution();
        System.out.println(executor.climbStairs(2));//2 - There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps
        System.out.println(executor.climbStairs(3));//3 - There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step
        System.out.println(executor.climbStairs(35));//14930352
    }
}

class ClimbingStairsSolution {
    public int climbStairs(int n) {
        int count = 1;
        int countOfUnits = n;
        int countOfDeuces = 0;
        while (countOfUnits - 2 >= 0) {
            countOfUnits -= 2;
            countOfDeuces++;
            count += getCountOfVariants(countOfUnits, countOfDeuces);
        }
        return count;
    }

    private int getCountOfVariants(int countOfUnits, int countOfDeuces) {
        if (countOfUnits == 0 || countOfDeuces == 0) {
            return 1;
        }
        if (countOfUnits == 1 || countOfDeuces == 1) {
            return countOfUnits + countOfDeuces;
        }
        return numberOfPermutationsWithRepetitions(countOfUnits, countOfDeuces);
    }

    private int numberOfPermutationsWithRepetitions(int firstTypeCount, int secondTypeCount) {
        return factorial(firstTypeCount + secondTypeCount)
                .divide(factorial(firstTypeCount).multiply(factorial(secondTypeCount))).intValue();
    }
    private BigInteger factorial(int num) {
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}