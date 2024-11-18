// Leetcode easy: Isomorphic Strings

import java.util.*;

public class Isomorphic_String {
    public static void main(String[] args) {
        String str1 = "paper";
        String str2 = "title";

        System.out.println(isIsomorphic(str1, str2));
    }

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        boolean isIso = true;
        HashMap<Character, Character> map = new HashMap<>();
        int i = 0;

        while (i < s.length()) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            i++;

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    isIso = false;
                    break;
                }
            } else {
                if (map.containsValue(ch2) == true) {
                    isIso = false;
                    break;
                } else {
                    map.put(ch1, ch2);
                }
            }
        }

        return isIso;
    }
}