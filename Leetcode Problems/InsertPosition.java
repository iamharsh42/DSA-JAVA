// Leetcode easy: Search Insert Position

public class InsertPosition {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;

        int ans = searchInsert(arr, target);
        System.out.println(ans);
    }

    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = nums.length - 1;

        if (target < nums[0]) {
            return 0;
        } else if (target > nums[n - 1]) {
            return n;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
