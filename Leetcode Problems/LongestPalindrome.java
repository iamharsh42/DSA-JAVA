// Leetcode easy : Longest Palindrome --> Bruteforce solution

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abbccefhg";
        System.out.println(longestPalindrome(str));
    }

    static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int len = 0;

        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            char c = set.getKey();
            int v = set.getValue();

            if (v % 2 == 0) {
                len = len + v;
            } else if (v != 1) {
                len = len + v - 1;
                map.put(c, 1);
            }
        }

        if (map.containsValue(1)) {
            len++;
        }

        return len;
    }
}
