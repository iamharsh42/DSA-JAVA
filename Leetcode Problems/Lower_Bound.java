// Lower Bound of Sorted Array

public class Lower_Bound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int x = 5;
        System.out.println(lowerBound(arr, 7, x));
    }

    static int lowerBound(int[] arr, int n, int x) {
        int ans = n;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}