// Merge Intervals: Leetcode medium

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] ans = merge(arr);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0)
            return new int[0][0];

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ans = new ArrayList<>();

        ans.add(intervals[0]);

        for (int i = 1; i < n; i++) {
            int[] lastInterval = ans.get(ans.size() - 1);

            if (intervals[i][0] > lastInterval[1]) {
                ans.add(intervals[i]);
            } else {
                lastInterval[1] = Math.max(intervals[i][1], lastInterval[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
