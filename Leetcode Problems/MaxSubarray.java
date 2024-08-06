// Maximum subarray sum : Leetcode medium

public class MaxSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }

    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int high = 0;

        while (high < nums.length) {
            sum = sum + nums[high];

            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
                high++;
            } else {
                high++;
            }

        }

        return max;
    }
}
