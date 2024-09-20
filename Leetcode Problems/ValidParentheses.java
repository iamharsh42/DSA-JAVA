// Valid Parentheses: Leetcode easy

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "(()){}]";
        boolean ans = isValid(str);
        System.out.println(ans);
    }

    static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        boolean didEnter = false;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                didEnter = true;
            } else {
                if (!stack.isEmpty()) {
                    char prev = stack.peek();

                    if (prev == '(' && ch == ')') {
                        stack.pop();
                    } else if (prev == '{' && ch == '}') {
                        stack.pop();
                    } else if (prev == '[' && ch == ']') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }

        if (stack.isEmpty() && didEnter == true) {
            return true;
        } else {
            return false;
        }
    }
}
