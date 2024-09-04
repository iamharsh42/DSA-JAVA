// Split Array Largest Sum: Leetcode hard

public class MinMaxSubarray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int n = 2;

        int ans = splitArray(arr, n);
        System.out.println(ans);
    }

    public static int splitArray(int[] arr, int k) {
        int low = findMax(arr);
        int high = findSum(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = reqSubarrays(arr, mid);

            if (students <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int reqSubarrays(int[] arr, int pages) {
        int subarrays = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= pages) {
                sum += arr[i];
            } else {
                subarrays++;
                sum = arr[i];
            }
        }

        return subarrays;
    }
}
