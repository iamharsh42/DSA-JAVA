// Leetcode Contest Question: Substring Matching Pattern --> Optimal Solutions

public class MatchSubstring {
    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "ee*e";
        System.out.println(hasMatch(str1, str2));

        String str3 = "car";
        String str4 = "c*v";
        System.out.println(hasMatch(str3, str4));
    }

    public static boolean hasMatch(String s, String p) {
        int starIndex = p.indexOf("*");
        if (starIndex == -1) {
            return s.equals(p);
        }

        String prefix = p.substring(0, starIndex);
        String suffix = p.substring(starIndex + 1);

        if (s.contains(prefix) && s.contains(suffix)) {
            int index = s.indexOf(prefix) + prefix.length();
            if (s.indexOf(suffix, index) != -1) {
                return true;
            }
        }

        return false;
    }

}
