// Leetcode daily challenge: Merge Two 2D Arrays by Summing Values --> Optimal solution (02/03/2025)

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSumValues {
    public static void main(String[] args) {
        int[][] nums1 = {{1, 3}, {2, 4}, {3, 5}};
        int[][] nums2 = {{2, 5}, {3, 4}, {4, 6}};
        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1][0] == nums2[p2][0]) {
                ArrayList<Integer> tl = new ArrayList<>();
                tl.add(nums1[p1][0]);
                tl.add(nums1[p1][1] + nums2[p2][1]);
                list.add(tl);
                p1++;
                p2++;
            } else if (nums1[p1][0] < nums2[p2][0]) {
                ArrayList<Integer> tl = new ArrayList<>();
                tl.add(nums1[p1][0]);
                tl.add(nums1[p1][1]);
                list.add(tl);
                p1++;
            } else {
                ArrayList<Integer> tl = new ArrayList<>();
                tl.add(nums2[p2][0]);
                tl.add(nums2[p2][1]);
                list.add(tl);
                p2++;
            }
        }

        while (p1 < nums1.length) {
            ArrayList<Integer> tl = new ArrayList<>();
            tl.add(nums1[p1][0]);
            tl.add(nums1[p1][1]);
            list.add(tl);
            p1++;
        }

        while (p2 < nums2.length) {
            ArrayList<Integer> tl = new ArrayList<>();
            tl.add(nums2[p2][0]);
            tl.add(nums2[p2][1]);
            list.add(tl);
            p2++;
        }

        int[][] res = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }

        return res;
    }
}
