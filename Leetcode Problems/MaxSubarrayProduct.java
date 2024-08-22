// Maximum Product Subarray: Leetcode medium

public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int[] arr = { 0, 10, 10, 10, 10, -10, 10, 10, 10, 10, 0 };
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    static int maxProduct(int[] nums) {
        double prefix = 1;
        double suffix = 1;

        int n = nums.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }

            if (suffix == 0) {
                suffix = 1;
            }

            prefix = prefix * nums[i];
            suffix = suffix * nums[n - 1 - i];

            max = Math.max(max, (int) (Math.max(prefix, suffix)));
        }

        return max;
    }
}
