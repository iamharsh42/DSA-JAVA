// Leetcode easy: Maximum Number of Words Found in Sentences --> Bruteforce solution

public class MaxNumWords {
    public static void main(String[] args) {
        String[] arr = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(mostWordsFound(arr));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;

        for (String sentence : sentences) {
            int words = numWords(sentence);
            max = Math.max(max, words);
        }

        return max;
    }

    public static int numWords(String str) {
        int words = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        return words + 1;
    }
}
