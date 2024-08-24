// First and Last Occurrences in Array: Leetcode problem

import java.util.*;

public class FirstLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean findFirstIndex) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (high >= low) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }
        return ans;
    }
}
