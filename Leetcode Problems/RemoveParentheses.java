// Remove Outermost Parentheses: Leetcode easy

import java.util.*;

public class RemoveParentheses {
    public static void main(String[] args) {
        String str = "(()())(())";
        String ans = removeOuterParentheses(str);
        System.out.println(ans);
    }

    static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!st.isEmpty()) {
                    str.append(ch);
                }

                st.push(ch);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    str.append(ch);
                }
            }
        }

        return str.toString();
    }
}