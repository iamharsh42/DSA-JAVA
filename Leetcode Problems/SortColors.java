// Leetcode medium: Sort Colors

import java.util.*;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 2, 1, 2, 0, 0, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = (nums.length - 1);

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
