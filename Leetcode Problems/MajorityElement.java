// Majority Element II: Leetcode medium
// Moore's voting algorithm

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        List<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }

    static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int mini = (int) (n / 3) + 1;
        int c1 = 0, c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (c1 == 0 && el2 != nums[i]) {
                c1 = 1;
                el1 = nums[i];
            } else if (c2 == 0 && el1 != nums[i]) {
                c2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                c1++;
            } else if (nums[i] == el2) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) {
                c1++;
            }

            if (nums[i] == el2) {
                c2++;
            }
        }

        if (c1 >= mini) {
            ans.add(el1);
        }

        if (c2 >= mini) {
            ans.add(el2);
        }

        Collections.sort(ans);

        return ans;
    }
}
