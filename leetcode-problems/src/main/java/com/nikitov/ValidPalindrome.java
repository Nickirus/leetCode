package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">valid-palindrome</a>
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        var executor = new ValidPalindromeSolution();
        System.out.println(executor.isPalindrome("A man, a plan, a canal: Panama"));//true
        System.out.println(executor.isPalindrome("race a car"));//false
        System.out.println(executor.isPalindrome(" "));//true
        System.out.println(executor.isPalindrome("0P"));//false
    }
}

class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        String strWithoutGarbage = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return new StringBuilder(strWithoutGarbage).reverse().toString().equals(strWithoutGarbage);
    }
}