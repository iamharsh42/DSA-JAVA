// Capacity To Ship Packages Within D Days: Leetcode medium

public class MinCapacity {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 5;
        int ans = shipWithinDays(arr, d);
        System.out.println(ans);
    }

    static int shipWithinDays(int[] weights, int days) {
        int low = maxWeight(weights);
        int high = sumOfWeights(weights);

        if (days == 1) {
            return high;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int d = calculateDays(weights, mid);

            if (d <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int calculateDays(int[] arr, int w) {
        int days = 1;
        int weight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (weight + arr[i] > w) {
                days++;
                weight = arr[i];
            } else {
                weight += arr[i];
            }
        }

        return days;
    }

    static int sumOfWeights(int[] arr) {
        int weight = 0;
        for (int i = 0; i < arr.length; i++) {
            weight += arr[i];
        }

        return weight;
    }

    static int maxWeight(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
