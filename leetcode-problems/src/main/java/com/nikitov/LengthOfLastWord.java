package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">length-of-last-word</a>
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        var executor = new LengthOfLastWordSolution();
        System.out.println(executor.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(executor.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(executor.lengthOfLastWord("Hello World"));
    }
}

class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] splitString = s.split(" ");
        if (splitString.length > 0) {
            return splitString[splitString.length - 1].length();
        } else return 0;
    }
}
