// Leetcode easy: Sort Even and Odd Indices Independently

import java.util.*;

public class SortEvenOdd {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3};
        int[] ans = sortEvenOdd(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> evenArr = new ArrayList<>();
        ArrayList<Integer> oddArr = new ArrayList<>();
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenArr.add(nums[i]);
            } else {
                oddArr.add(nums[i]);
            }
        }

        Collections.sort(oddArr, Collections.reverseOrder());
        Collections.sort(evenArr);

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans[i] = evenArr.get(even);
                even++;
            } else {
                ans[i] = oddArr.get(odd);
                odd++;
            }
        }

        return ans;
    }

}
