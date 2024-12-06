// Return the number of complete rows of the staircase you will build

/**
 * @param {number} n
 * @return {number}
 */

var arrangeCoins = function (n) {
  let row = 1;

  while (n >= row) {
      n -= row;
      row++;
  }

  return row - 1;
};