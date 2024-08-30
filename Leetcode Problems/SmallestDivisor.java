// Find the Smallest Divisor Given a Threshold: Leetcode medium

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9 };
        int th = 6;

        int ans = smallestDivisor(arr, th);
        System.out.println(ans);
    }

    static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = findMaxElement(nums);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int ds = divisionSum(nums, mid);

            if (ds <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    static int divisionSum(int[] arr, int n) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = (int) Math.ceil((double) arr[i] / n);
            sum += temp;
        }

        return sum;
    }
}
