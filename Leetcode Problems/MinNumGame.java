// Leetcode easy: Minimum Number Game --> Bruteforce solution

import java.util.*;

public class MinNumGame {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 6, 3 };
        System.out.println(Arrays.toString(numberGame(nums)));
    }

    public static int[] numberGame(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];

        Arrays.sort(nums);

        for (int i = 0; i < len; i += 2) {
            ans[i] = nums[i + 1];
            ans[i + 1] = nums[i];
        }

        return ans;

    }
}