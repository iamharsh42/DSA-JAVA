// Leetcode easy: Ransom Note --> Optimal solution

public class RansomNote {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcd";
        System.out.println(canConstruct(str1, str2));

        String str3 = "abcd";
        String str4 = "efgh";
        System.out.println(canConstruct(str3, str4));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}