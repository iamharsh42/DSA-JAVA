// Leetcode easy: Longest Common Prefix

public class Common_Prefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int minLen = minStr(strs);

        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            boolean isSame = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) == ch) {
                    // continue;
                } else {
                    isSame = false;
                    break;
                }
            }

            if (isSame == false) {
                break;
            } else {
                ans.append(ch);
            }
        }

        if (ans.length() == 0) {
            return "";
        } else {
            return ans.toString();
        }

    }

    static int minStr(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            int len = str.length();
            min = Math.min(min, len);
        }

        return min;
    }
}
