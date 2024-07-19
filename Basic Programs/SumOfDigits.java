public class SumOfDigits {
    public static void main(String[] args) {
        // int ans = reverse(12345);
        // System.out.println(ans);
        System.out.println((int) (Math.log10(1234)));
    }

    static int reverse(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * 10 + reverse(n / 10);
    }
}
