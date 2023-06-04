package com.nikitov;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/group-anagrams/">group-anagrams</a>
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        var executor = new GroupAnagramsSolution();
        System.out.println(executor.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));//[["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(executor.groupAnagrams(new String[]{""}));//[[""]]
        System.out.println(executor.groupAnagrams(new String[]{"a"}));//[["a"]]
        System.out.println(executor.groupAnagrams(new String[]{"", ""}));//[["", ""]]
    }
}

class GroupAnagramsSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String str : strs) {
            char[] sortedLetters = str.toCharArray();
            Arrays.sort(sortedLetters);
            String key = new String(sortedLetters);

            if (resultMap.get(key) == null) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                resultMap.put(key, list);
            } else {
                resultMap.get(key).add(str);
            }
        }
        return new ArrayList<>(resultMap.values());
    }
}