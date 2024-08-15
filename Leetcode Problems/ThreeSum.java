// Three Sum: Leetcode medium

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, 4 };
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    // optimal solution
    static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }

    // static List<List<Integer>> threeSum(int[] nums) {
    // int n = nums.length;
    // Set<List<Integer>> triplets = new HashSet<>();

    // for (int i = 0; i < n; i++) {
    // Set<Integer> hashset = new HashSet<>();
    // for (int j = i + 1; j < n; j++) {
    // int third = -(nums[i] + nums[j]);

    // if (hashset.contains(third)) {
    // List<Integer> temp = new ArrayList<>();
    // temp.add(nums[i]);
    // temp.add(nums[j]);
    // temp.add(third);
    // Collections.sort(temp);

    // triplets.add(temp);
    // }

    // hashset.add(nums[j]);
    // }
    // }

    // List<List<Integer>> ans = new ArrayList(triplets);
    // return ans;
    // }
}