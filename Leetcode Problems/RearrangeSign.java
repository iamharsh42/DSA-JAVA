// Leetcode medium: Rearrange Array Elements by Sign

import java.util.Arrays;

public class RearrangeSign {

    public static void main(String[] args) {
        int[] arr = {3, 1, -1, -5, 2, -4};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pIndex = 0;
        int nIndex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[pIndex] = nums[i];
                pIndex += 2;
            } else {
                ans[nIndex] = nums[i];
                nIndex += 2;
            }
        }

        return ans;
    }
}
