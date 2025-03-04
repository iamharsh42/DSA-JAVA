// Leetcode daily challenge: Partition Array According to Given Pivot --> Optimal solution (03/03/2025)
import java.util.*;

public class PartArrPivot{
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 5, 6, 4};
        int pivot = 3;
        int[] res = pivotArray(arr, pivot);
        System.out.println(Arrays.toString(res));
    }

    static int[] pivotArray(int[] nums, int pivot) {
        int lc = 0;
        int pc = 0;
        int gc = 0;

        for(int n: nums){
            if(n < pivot){
                lc++;
            } else if(n > pivot){
                gc++;
            } else {
                pc++;
            }
        }

        int i = 0;
        int j = lc;
        int k = lc+pc;
        int[] res = new int[nums.length];

        for(int n: nums){
            if(n < pivot){
                res[i] = n;
                i++;
            } else if(n > pivot){
                res[k] = n;
                k++;
            } else {
                res[j] = n;
                j++;
            }
        }

        return res;

    }
}