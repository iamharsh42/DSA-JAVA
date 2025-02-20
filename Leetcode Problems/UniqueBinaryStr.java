// Leetcode daily challenge: Find Unique Binary String --> Optimal solution (20/02/2025)

public class UniqueBinaryStr {
    public static void main(String[] args) {
        String[] nums = {"111", "011", "001"};
        System.out.println(findDifferentBinaryString(nums));
    }

    static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<n; i++){
            char ch = nums[i].charAt(i) == '0' ? '1' : '0';
            res.append(ch);
        }

        return res.toString();
    }
}
