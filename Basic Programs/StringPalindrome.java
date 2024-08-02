// java program to check if a given string is palindrome or not.

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "Hi, My name is Harsh@19";
        String str2 = "madam";

        boolean ans = isPalindrome(str2);

        System.out.println(ans);

    }

    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z^]", "");
        s = s.toLowerCase();

        int n = s.length();
        int i = 0;

        while (i <= n / 2) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }

            if (s.charAt(i) == s.charAt(n - i - 1)) {
                i++;
            }
        }

        return true;
    }
}
