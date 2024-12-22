// Leetcode easy: Add Digits --> Bruteforce solution

public class AddDigits {
    public static void main(String[] args) {
        int n = 456;
        System.out.println(addDigits(n));
    }

    public static int addDigits(int num) {

        if (num < 10) {
            return num;
        }

        int ans = 0;

        while (num >= 10) {
            int temp = num;
            ans = 0;
            while (temp > 0) {
                int digit = temp % 10;
                ans += digit;
                temp = temp / 10;
            }

            num = ans;
        }

        return ans;
    }
}
