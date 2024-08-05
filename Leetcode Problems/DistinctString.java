// Leetcode easy problem: Distinct string in an array

import java.util.ArrayList;

public class DistinctString {

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        String ans = kthDistinct(arr, 2);
        System.out.println(ans);
    }

    static String kthDistinct(String[] arr, int k) {
        ArrayList<String> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (count == 1) {
                arr2.add(arr[i]);
            }
        }

        if (arr2.size() >= k) {
            return arr2.get(k - 1);
        } else {
            return "";
        }
    }
}
