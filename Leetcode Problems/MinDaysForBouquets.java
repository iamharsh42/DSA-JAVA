// Minimum Number of Days to Make m Bouquets: Leetcode medium

public class MinDaysForBouquets {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 12, 7, 7 };
        int m = 2;
        int n = 3;
        int ans = minDays(arr, m, n);
        System.out.println(ans);
    }

    static int minDays(int[] bloomDay, int m, int k) {

        if (bloomDay.length < m * (long) k) {
            return -1;
        }

        int low = 0;
        int high = findMaxElement(bloomDay);

        while (low != high) {
            int mid = low + (high - low) / 2;

            int adjacentFlowers = findAdjacentFlowers(bloomDay, mid, k);

            if (adjacentFlowers >= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }

    static int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    static int findAdjacentFlowers(int[] arr, int day, int k) {
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count2++;
            } else {
                count2 = 0;
            }

            if (count2 == k) {
                count++;
                count2 = 0;
            }
        }

        return count;
    }
}
