// Leetcode daily challenge: Construct Smallest Number From DI String --> Optimal solution (18/02/2025)

import java.util.Stack;

public class MinNumStr {
    public static void main(String[] args) {
        System.out.println(smallestNumber("IDID"));
        System.out.println(smallestNumber("III"));
    }

    static String smallestNumber(String pattern) {
        Stack<Integer> s1 = new Stack<>();
        StringBuilder res = new StringBuilder();
        int i=1;

        while(i <= pattern.length()){
            s1.push(i);
            if(pattern.charAt(i-1) == 'I'){
                while(!s1.isEmpty()){
                    res.append(s1.pop());
                }
            }
            i++;
        }

        s1.push(i);
        while(!s1.isEmpty()){
             res.append(s1.pop());
        }

        return res.toString();
    }
}
