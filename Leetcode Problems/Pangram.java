// Leetcode easy: Check if the Sentence Is Pangram --> Bruteforce solution

public class Pangram {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(checkIfPangram(str));
    }

    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.replaceAll("\\s", "");

        int[] arr = new int[26];

        int len = sentence.length();

        for (int i = 0; i < len; i++) {
            char ch = sentence.charAt(i);
            int index = ch - 'a';
            arr[index] = 1;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }

        return true;
    }
}
