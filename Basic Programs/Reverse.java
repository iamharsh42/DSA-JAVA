
public class Reverse {

    public static void main(String[] args) {
        int n = 1534236469;
        int ans = reverse(n);
        System.out.println(ans);
    }

    static int reverse(int n) {
        int reverseNum = 0;

        while (n != 0) {
            int digit = n % 10;
            n = n / 10;

            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reverseNum = reverseNum * 10 + digit;
        }

        return reverseNum;
    }
}
