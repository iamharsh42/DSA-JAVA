// Leetcode medium: Next permutation

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void nextPermutation(int[] nums) {
        int dip = -1;
        int n = nums.length;

        if (n > 1) {

            if (n == 2) {
                swap(nums, 0, 1);
            } else {
                for (int i = n - 2; i >= 0; i--) {
                    if (nums[i] < nums[i + 1]) {
                        dip = i;
                        break;
                    }
                }

                if (dip == -1) {
                    reverse(nums, 0, n - 1);
                } else {
                    for (int i = n - 1; i > dip; i--) {
                        if (nums[i] > nums[dip]) {
                            swap(nums, i, dip);
                            break;
                        }
                    }

                    reverse(nums, dip + 1, n - 1);
                }
            }

        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
