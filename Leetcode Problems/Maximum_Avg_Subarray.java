// Leetcode easy: Maximum Average Subarray I
// Using Sliding Window Approach

public class Maximum_Avg_Subarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        int n = 3;
        System.out.println(findMaxAverage(arr, n));
    }

    static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAvg = sum / k;

        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1];
            sum = sum + nums[i + k - 1];

            double avg = sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
}