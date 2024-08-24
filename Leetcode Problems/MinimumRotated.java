// Find Minimum in Rotated Sorted Array: Leetcode medium

public class MinimumRotated {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int ans = findMin(arr);
        System.out.println(ans);
    }

    static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= nums[high]) {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            } else if (nums[mid] >= nums[low]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }
        }

        return min;
    }
}
