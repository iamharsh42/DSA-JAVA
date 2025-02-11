// Leetcode daily challenge: Maximum Ascending Subarray Sum --> Optimal solution

public class MaxAscSubArrSum {
    public static void main(String[] args) {
        int[] arr1 = {3,6,10,1,8,9,9,8,9};
        int[] arr2 = {100, 10, 1};
        int[] arr3 = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(arr1));
        System.out.println(maxAscendingSum(arr2));
        System.out.println(maxAscendingSum(arr3));
    }

    static int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}
