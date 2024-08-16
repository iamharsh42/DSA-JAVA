// Maximum Distance in Arrays: Leetcode medium

import java.util.*;

public class MaxDistance {
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        // arrays.add(Arrays.asList(1, 4));
        // arrays.add(Arrays.asList(0, 5));

        arrays.add(Arrays.asList(1, 3, 10));
        arrays.add(Arrays.asList(0, 5));

        int ans = maxDistance(arrays);
        System.out.println(ans);
    }

    static int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int min = arrays.get(0).get(0);
        int ans = 0;

        int n = arrays.size();

        for (int i = 1; i < n; i++) {
            List<Integer> temp = arrays.get(i);

            int n2 = temp.size();
            int max1 = temp.get(n2 - 1);
            int min1 = temp.get(0);

            ans = Math.max(ans, Math.max(max1 - min, max - min1));
            min = Math.min(min, min1);
            max = Math.max(max, max1);
        }

        return ans;
    }
}
