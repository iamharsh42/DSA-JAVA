// Kth Missing Positive Number: Leetcode easy

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6 };
        int n = 5;
        int ans = findKthPositive(arr, n);
        System.out.println(ans);
    }

    static int findKthPositive(int[] arr, int k) {
        int index = 0;
        int currentNum = 1;
        int missingCount = 0;

        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentNum) {
                index++;
            } else {
                missingCount++;
            }

            if (missingCount == k) {
                return currentNum;
            }

            currentNum++;
        }

        return -1;
    }
}