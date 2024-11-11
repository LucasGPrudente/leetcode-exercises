// Return the square root of x rounded down to the nearest integer

/**
 * @param {number} x
 * @return {number}
 */

var mySqrt = function (x) {
  let num = 0;

  while (num * num > x) {
      num /= 2;
  }

  while (num * num <= x) {
      num++;
  }

  return num - 1;
};