class Solution {

    // Return the number of islands
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    mark(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    // Mark all connected lands
    public void mark(char[][] grid, int i, int j) {
        grid[i][j] = '*';

        if (i > 0 && grid[i - 1][j] == '1') { mark(grid, i - 1, j); }

        if (j > 0 && grid[i][j - 1] == '1') { mark(grid, i, j - 1); }

        if (i < grid.length - 1 && grid[i + 1][j] == '1') { mark(grid, i + 1, j); }

        if (j < grid[0].length - 1 && grid[i][j + 1] == '1') { mark(grid, i, j + 1); }
    }
}