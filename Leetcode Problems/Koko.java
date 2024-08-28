// Koko Eating Bananas: Leetcode medium

public class Koko {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        int h = 8;
        int ans = minEatingSpeed(arr, h);
        System.out.println(ans);
    }

    static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int low = 1;
        int high = max;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalTime = totalTime(piles, mid);

            if (totalTime <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static int totalTime(int[] arr, int n) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil((double) (arr[i]) / (double) (n));
        }

        return total;
    }
}