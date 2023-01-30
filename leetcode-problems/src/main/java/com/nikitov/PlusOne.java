package com.nikitov;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/plus-one/">plus-one</a>
 */
public class PlusOne {
    public static void main(String[] args) {
        var executor = new PlusOneSolution();
        System.out.println(Arrays.toString(executor.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(executor.plusOne(new int[]{9})));
    }

}

class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        var str = new StringBuilder();
        for (int i : digits) {
            str.append(i);
        }

        var bigIntegerValue = new BigInteger(str.toString());
        bigIntegerValue = bigIntegerValue.add(BigInteger.ONE);
        String[] strArray = bigIntegerValue.toString().split("");
        int[] result = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            result[i] = Integer.parseInt(strArray[i]);
        }
        return result;
    }
}
