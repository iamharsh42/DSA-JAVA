// Leetcode easy : Longest Harmonious Subsequence --> Optimal solution

import java.util.Arrays;

public class LongestHarmoniousSubseq {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(findLHS(arr));
    }

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxLen = 0;
        if (nums[0] == nums[nums.length - 1]) {
            return maxLen;
        }

        int start = 0;
        int end = 1;

        while (start < nums.length && end < nums.length) {
            if (nums[start] == nums[end]) {
                end++;
            } else if (nums[end] - nums[start] == 1) {
                int len = end - start + 1;
                maxLen = Math.max(maxLen, len);
                end++;
            } else {
                start++;
            }
        }

        return maxLen;
    }
}