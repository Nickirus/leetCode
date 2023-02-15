package com.nikitov;

import java.math.BigInteger;

/**
 * @see <a href="https://leetcode.com/problems/add-binary/">add-binary</a>
 */
public class AddBinary {
    public static void main(String[] args) {
        var executor = new AddBinarySolution();
        System.out.println(executor.addBinary("0", "0"));//0
        System.out.println(executor.addBinary("1", "0"));//1
        System.out.println(executor.addBinary("11", "1"));//100
        System.out.println(executor.addBinary("1010", "1011"));//10101
        System.out.println(executor.addBinary("1010", "1000"));//10010
    }
}

class AddBinarySolution {
    public String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
}
