// Leetcode Easy: Valid Anagram --> Optimal solution

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "rat";
        System.out.println(isAnagram(str1, str2));

        String str3 = "bob";
        String str4 = "obb";
        System.out.println(isAnagram(str3, str4));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
