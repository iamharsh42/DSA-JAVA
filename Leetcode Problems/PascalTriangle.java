// Pascal's Triangle: Leetcode easy

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int nums = 5;
        List<List<Integer>> ans = generate(nums);
        System.out.println(ans);
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 1) {
            ans.add(Arrays.asList(1));
            return ans;
        } else if (numRows == 2) {
            ans.add(Arrays.asList(1));
            ans.add(Arrays.asList(1, 1));
            return ans;
        } else {
            ans.add(Arrays.asList(1));
            ans.add(Arrays.asList(1, 1));

            for (int i = 3; i <= numRows; i++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(1);
                List<Integer> prevList = ans.get(i - 2);
                int size = prevList.size();
                for (int j = 0; j < size - 1; j++) {
                    int tempValue = prevList.get(j) + prevList.get(j + 1);
                    temp.add(tempValue);
                }
                temp.add(1);

                ans.add(temp);
            }

            return ans;
        }
    }
}
