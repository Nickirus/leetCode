package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/valid-anagram/">valid-anagram</a>
 */
public class ValidAnagram {
    public static void main(String[] args) {
        var executor = new ValidAnagramSolution();
        System.out.println(executor.isAnagram("anagram", "nagaram"));//true
        System.out.println(executor.isAnagram("rat", "car"));//false
        System.out.println(executor.isAnagram("ab", "ba"));//true
        System.out.println(executor.isAnagram("aa", "bb"));//false
    }
}

class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] frequencyByLetters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequencyByLetters[s.charAt(i) - 'a']++;
            frequencyByLetters[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < frequencyByLetters.length; i++) {
            if (frequencyByLetters[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

