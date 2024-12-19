// Return the bitwise AND of all numbers in the range [left, right]

/**
 * @param {number} left
 * @param {number} right
 * @return {number}
 */

var rangeBitwiseAnd = function (left, right) {
  let count = 0;

  while (left != right) {
      left = parseInt(left / 2);
      right = parseInt(right / 2);
      count++;
  }

  while (count > 0) {
      left *= 2;
      count--;
  }

  return left;
};