// Leetcode daily challenge: Apply Operations to an Array --> Optimal solution (01/03/2025)
import java.util.Arrays;

public class OprArray{
    public static void main(String[] args){
        int[] nums = {1,2,2,4,5};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }

    static int[] applyOperations(int[] nums) {
        int nz = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(i <n-1 && nums[i] != 0 && nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }

            if(nums[i] != 0){
                if(i != nz){
                    int temp = nums[i];
                    nums[i] = nums[nz];
                    nums[nz] = temp;
                }

                nz++;
            }
        }

        return nums;
    }
}