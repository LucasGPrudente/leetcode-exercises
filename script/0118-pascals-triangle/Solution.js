// Return the first numRows of Pascal's triangle

/**
 * @param {number} numRows
 * @return {number[][]}
 */

var generate = function (numRows) {
  let triangle = [[1]];
  let lastRow = [];

  for (let i = 1; i < numRows; i++) {
      let currRow = [1];

      for (let j = 1; j < i; j++) {
          currRow.push(lastRow[j] + lastRow[j - 1]);
      }

      currRow.push(1);
      triangle.push(currRow);
      lastRow = currRow;
  }

  return triangle;
};