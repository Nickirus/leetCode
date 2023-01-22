package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/">palindrome-number</a>
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        var executor = new PalindromeNumberSolution();
        System.out.println(executor.isPalindrome(121));
        System.out.println(executor.isPalindrome(11));
    }
}

class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        var xString = String.valueOf(x);
        boolean isEvenLength = xString.length() % 2 == 0;
        var ascOrdered = xString.substring(0, xString.length() / 2);
        var descOrdered = new StringBuilder(xString.substring(xString.length() / 2 + (isEvenLength ? 0 : 1))).reverse().toString();
        return ascOrdered.equals(descOrdered);
    }
}

