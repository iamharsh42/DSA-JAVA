// Leetcode easy: Find First Palindromic String in the Array --> Bruteforce solution

public class FirstPalindromeStr {
    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };

        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {

        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}