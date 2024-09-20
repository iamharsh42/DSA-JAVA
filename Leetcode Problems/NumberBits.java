// Number of 1 Bits: Leetcode easy

public class NumberBits {
    public static void main(String[] args) {
        int n = 45;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }

    static int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);

        int len = num.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            int ch = num.charAt(i);

            if (ch == '1') {
                count++;
            }
        }

        return count;
    }
}
