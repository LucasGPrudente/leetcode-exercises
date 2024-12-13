// Determine if a 9 x 9 Sudoku board is valid

/**
 * @param {character[][]} board
 * @return {boolean}
 */

var isValidSudoku = function (board) {
  let row = Array(9).fill().map(() => new Set());
  let column = Array(9).fill().map(() => new Set());
  let square = Array(9).fill().map(() => new Set());

  for (let i = 0; i < 9; i++) {
      for (let j = 0; j < 9; j++) {
          if (board[i][j] != '.') {
              let num = board[i][j] - 1;
              let sqr = parseInt(j / 3) + (3 * parseInt(i / 3));

              if (row[i].has(num) || column[j].has(num) || square[sqr].has(num)) {
                  return false;
              }

              row[i].add(num)
              column[j].add(num)
              square[sqr].add(num)
          }
      }
  }

  return true;
};