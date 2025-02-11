// Leetcode daily challenge: Clear Digits --> Optimal solution

import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        String s = "a1b2c3d4bb";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();

        for(char ch: stack){
            res.append(ch);
        }

        return res.toString();
    }
}
