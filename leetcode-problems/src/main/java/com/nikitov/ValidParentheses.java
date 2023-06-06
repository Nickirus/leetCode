package com.nikitov;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">valid-parentheses</a>
 */
public class ValidParentheses {
    public static void main(String[] args) {
        var executor = new ValidParenthesesSolution();
        System.out.println(executor.isValid("()"));//true
        System.out.println(executor.isValid("()[]{}"));//true
        System.out.println(executor.isValid("(]"));//false
    }
}

class ValidParenthesesSolution {
    public boolean isValid(String s) {
        Map<Character, Character> openToCloseParenthesesMap = new HashMap<>();
        openToCloseParenthesesMap.put(')','(');
        openToCloseParenthesesMap.put('}','{');
        openToCloseParenthesesMap.put(']','[');
        Stack<Character> closedBracesStack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                closedBracesStack.push(character);
            } else if (closedBracesStack.size() == 0
                    || !closedBracesStack.pop().equals(openToCloseParenthesesMap.get(character))) {
                return false;
            }
        }
        return closedBracesStack.size() == 0;
    }
}