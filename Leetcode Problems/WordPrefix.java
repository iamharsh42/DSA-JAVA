// Leetcode easy: Counting Words With a Given Prefix --> Optimal solution

public class WordPrefix {
    public static void main(String[] args) {
        String[] words = { "Rat", "Ram", "Rage", "Hello" };
        String prefix = "Ra";
        System.out.println(prefixCount(words, prefix));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String str : words) {
            if (str.startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}
