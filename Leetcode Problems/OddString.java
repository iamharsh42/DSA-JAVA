// Largest Odd Number in String: Leetcode easy

public class OddString {
    public static void main(String[] args) {
        String str = "123456";
        String ans = largestOddNumber(str);
        System.out.println(ans);
    }

    static String largestOddNumber(String num) {
        int end = num.length() - 1;

        while (end >= 0) {
            int lastDigit = (int) (num.charAt(end));
            if (lastDigit % 2 != 0) {
                String ans = num.substring(0, end + 1);
                return ans;
            }
            end--;
        }

        return "";
    }
}