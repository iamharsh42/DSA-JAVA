// Merge Sorted Array: Leetcode easy

import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] arr2 = { 2, 5, 6 };
        int n = 3;

        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                rightShift(nums1, i, m);
                m++;
                nums1[i] = nums2[j];
                j++;
            }
        }

        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }

    static void rightShift(int[] arr, int index, int m) {
        for (int i = m; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }
}
