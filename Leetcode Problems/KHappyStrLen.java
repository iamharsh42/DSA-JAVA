// Leetcode daily challenge: The k-th Lexicographical String of All Happy Strings of Length n --> Optimal solution (19/02/2025)

import java.util.ArrayList;

public class KHappyStrLen {
    static char[] letters = {'a', 'b', 'c'};
    public static void main(String[] args) {
        System.out.println(getHappyString(3, 8));
    }

    static String getHappyString(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        backtrack(n, list, "");
        if(list.size() < k){
            return "";
        } 

        return list.get(k-1);
    }

    static void backtrack(int n, ArrayList<String> list, String currVal){
        if(currVal.length() == n){
            list.add(currVal);
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (currVal.length() > 0 && currVal.charAt(currVal.length() - 1) == letters[i]) {
                continue;
            }
            backtrack(n, list, currVal + letters[i]);
        }
    }
}
