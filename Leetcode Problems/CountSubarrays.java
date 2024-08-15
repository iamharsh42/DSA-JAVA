// Leetcode medium: Subarray Sum Equals K

import java.util.*;

public class CountSubarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int ans = subarraySum(arr, 3);
        System.out.println(ans);
    }

    static int subarraySum(int[] nums, int k) {
        int counter = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        map.put(0L, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            long temp = sum - k;
            if (map.containsKey(temp)) {
                counter += map.get(temp);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return counter;
    }
}
