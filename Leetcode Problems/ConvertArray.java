// Convert 1D Array Into 2D Array: Leetcode easy

public class ConvertArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[][] ans = construct2DArray(arr, 2, 3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            int[][] arr = new int[0][0];
            return arr;
        }

        int[][] ans = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[index];
                index++;
            }
        }

        return ans;
    }
}
