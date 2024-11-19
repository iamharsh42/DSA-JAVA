// Leetcode easy: Contains Duplicate II

import java.util.HashMap;

public class Contans_Duplicate_II {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean isTrue = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (map.containsKey(n)) {
                int secondIndex = map.get(n);
                if (Math.abs(secondIndex - i) <= k) {
                    isTrue = true;
                    break;
                }
            }

            map.put(nums[i], i);
        }

        return isTrue;
    }
}
