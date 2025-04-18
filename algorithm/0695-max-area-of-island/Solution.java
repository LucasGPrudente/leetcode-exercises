class Solution {

    // Return the maximum area of an island in grid
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, areaOfIsland(grid, i, j));
                }
            }
        }

        return max;
    }

    // Return the area of an island
    public int areaOfIsland(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int res = 1;

        grid[i][j] = 0;

        res += areaOfIsland(grid, i - 1, j);
        res += areaOfIsland(grid, i, j - 1);
        res += areaOfIsland(grid, i + 1, j);
        res += areaOfIsland(grid, i, j + 1);

        return res;
    }
}