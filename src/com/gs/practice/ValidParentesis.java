package com.gs.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentesis {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == '[' && top != ']'))
                    return false;
            }


        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "({})";
        System.out.println(isValid(s));
    }

}
