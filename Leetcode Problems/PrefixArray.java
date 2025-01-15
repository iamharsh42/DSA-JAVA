// Leetcode daily challenge: Find the Prefix Common Array of Two Arrays --> Optimal solution

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrefixArray{
    public static void main(String[] args) {
        int[] A = {2,1,4,3,5};
        int[] B = {5,1,2,3,4};

        int[] prefixArray = findThePrefixCommonArray(A, B);
        System.out.println(Arrays.toString(prefixArray));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] prefixArray = new int[A.length];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int count = 0;

        for(int i=0; i<A.length; i++){
            int num1 = A[i];
            set1.add(num1);
            int num2 = B[i];
            set2.add(num2);

            if(num1 == num2){
                count++;
            } else {
                if(set1.contains(num2)){
                    count++;
                }

                if(set2.contains(num1)){
                    count++;
                }
            }

            prefixArray[i] = count;
        }

        return prefixArray;
    }
}