// Leetcode daily challenge : Max Sum of a Pair With Equal Sum of Digits --> Better solution (12/02/2025)

import java.util.HashMap;

public class MaxPairEqualSOD{
    public static void main(String[] args){
        int[] nums = {18,43,36,13,7};
        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for(int i=0; i<nums.length; i++){
            int sod = sumOfDigits(nums[i]);
            if(map.containsKey(sod)){
                int sum = nums[i] + map.get(sod);
                max = Math.max(sum, max);
                map.put(sod, Math.max(map.get(sod), nums[i]));
            } else {
                map.put(sod, nums[i]);
            }
        }

        return max;
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum+=d;
        }

        return sum;
    }
}