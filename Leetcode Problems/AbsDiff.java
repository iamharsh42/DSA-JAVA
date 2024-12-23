// Leetcode easy: Difference Between Element Sum and Digit Sum of an Array --> Bruteforce solution

public class AbsDiff {
    public static void main(String[] args) {
        int[] arr = { 1, 15, 10, 5 };
        System.out.println(differenceOfSum(arr));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int num : nums) {
            elementSum += num;
        }

        int digitSum = 0;
        for (int num : nums) {
            digitSum += sumOfDigits(num);
        }

        return Math.abs(elementSum - digitSum);

    }

    public static int sumOfDigits(int num) {
        if (num < 10) {
            return num;
        }

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            sum += digit;
        }

        return sum;
    }
}
