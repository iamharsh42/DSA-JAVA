// Single Element in a Sorted Array: Leetcode medium

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }

    static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int low = 1;
        int high = nums.length - 2;

        if (nums[low] != nums[low - 1]) {
            return nums[low - 1];
        }

        if (nums[high] != nums[high + 1]) {
            return nums[high + 1];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    high = mid - 2;
                } else {
                    low = mid + 1;
                }
            } else {
                if (mid % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}