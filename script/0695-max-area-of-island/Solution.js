// Return the maximum area of an island in grid

/**
 * @param {number[][]} grid
 * @return {number}
 */

var maxAreaOfIsland = function (grid) {
  let max = 0;
  let area = 0;

  for (let i = 0; i < grid.length; i++) {
      for (let j = 0; j < grid[0].length; j++) {
          if (grid[i][j] == 1) {
              area = 0;
              mark(grid, i, j);
              max = Math.max(max, area);
          }
      }
  }

  return max;

  // Return area of an island
  function mark(grid, i, j) {
      grid[i][j] = 0;
      area++;

      if (i > 0 && grid[i - 1][j] == 1) { mark(grid, i - 1, j); }
      if (j > 0 && grid[i][j - 1] == 1) { mark(grid, i, j - 1); }
      if (i < grid.length - 1 && grid[i + 1][j] == 1) { mark(grid, i + 1, j); }
      if (j < grid[0].length - 1 && grid[i][j + 1] == 1) { mark(grid, i, j + 1); }
  }
};