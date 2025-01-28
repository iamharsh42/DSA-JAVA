// Leetcode daily challenge: Maximum Number of Fish in a Grid --> Optimal solution

public class MaxFishGrid {
    static int rows;
    static int cols;
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
        };

        System.out.println(findMaxFish(grid));
    }

    static int findMaxFish(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int maxFishes = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] != 0){
                    maxFishes = Math.max(maxFishes, dfs(i,j, grid));
                }
            }
        }

        return maxFishes;
    }

    static int dfs(int row, int col, int[][] grid){
        if(row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0){
            return 0;
        }

        int sum = grid[row][col];
        grid[row][col] = 0;
        sum += dfs(row+1, col, grid) + dfs(row-1, col, grid) + dfs(row, col+1, grid) + dfs(row, col-1, grid);

        return sum;
    }

}
