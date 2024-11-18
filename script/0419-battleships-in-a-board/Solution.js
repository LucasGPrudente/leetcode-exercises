// Return the number of the battleships on board

/**
 * @param {character[][]} board
 * @return {number}
 */

var countBattleships = function (board) {
  let count = 0;

  // Mark the battleship on board
  const mark = function (board, i, j) {
      if (board[i][j] != "X") { return; }

      board[i][j] = "*";

      if (i < board.length - 1) { mark(board, i + 1, j); }
      if (j < board[0].length - 1) { mark(board, i, j + 1); }
      if (i > 0) { mark(board, i - 1, j); }
      if (j > 0) { mark(board, i, j - 1); }
  }

  let m = board.length;
  let n = board[0].length;

  for (let i = 0; i < m; i++) {
      for (let j = 0; j < n; j++) {
          if (board[i][j] == "X") {
              mark(board, i, j);
              count++;
          }
      }
  }

  return count;
};