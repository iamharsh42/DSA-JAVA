// Reverse Words in a String: Leetcode medium

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String ans = reverseWords(str);
        System.out.println(ans);
    }

    static String reverseWords(String s) {
        String newStr = s.trim();
        StringBuilder str = new StringBuilder();

        int end = newStr.length() - 1;
        int start = end;

        while (start >= 0) {
            while (start >= 0 && newStr.charAt(start) != ' ') {
                start--;
            }

            str.append(newStr.substring(start + 1, end + 1)).append(' ');

            while (start >= 0 && newStr.charAt(start) == ' ') {
                start--;
            }

            end = start;
        }

        return str.toString().trim();
    }
}
