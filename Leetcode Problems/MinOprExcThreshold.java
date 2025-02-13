// Leetcode daily challenge : Minimum Operations to Exceed Threshold Value II --> Better solution (13/02/2025)

import java.util.PriorityQueue;

public class MinOprExcThreshold {
    public static void main(String[] args) {
        int[] nums = {1000000000,999999999,1000000000,999999999,1000000000,999999999};
        int k = 1000000000;
        System.out.println(minOperations(nums, k));
    }

     static int minOperations(int[] nums, int k) {
        int operations = 0;
        PriorityQueue<Long> p = new PriorityQueue<>();
        for(int n: nums){
            p.add((long)(n));
        }

        while(p.peek() < k){
            operations++;
    
            long n1 = p.poll();
            long n2 = p.poll();

            long n3 = (Math.min(n1,n1)*2) + Math.max(n1,n2);
            p.add(n3);
            if(p.size() == 1){
                break;
            }
        }

        return operations;
    }
}
