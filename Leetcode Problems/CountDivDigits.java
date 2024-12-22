// Leetcode easy: Count the Digits That Divide a Number --> Bruteforce solution

public class CountDivDigits {
    public static void main(String[] args) {
        int num = 4242;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int count = 0;

        int refNum = num;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;

            if (refNum % digit == 0) {
                count++;
            }
        }

        return count;
    }
}
