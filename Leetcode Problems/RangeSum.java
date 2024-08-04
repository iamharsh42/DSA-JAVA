
import java.util.*;

public class RangeSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int ans = rangeSum(arr, 4, 1, 5);
        System.out.println(ans);
    }

    static int rangeSum(int[] nums, int n, int left, int right) {
        int modulo = (int) 1e9 + 7;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j] % modulo;
                arr.add(sum);
            }
        }

        Collections.sort(arr);

        int ans = 0;
        for (int i = left; i <= right; i++) {
            ans = (ans + arr.get(i - 1)) % modulo;
        }
        return ans;
    }
}
