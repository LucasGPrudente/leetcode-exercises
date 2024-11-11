// Increment the large integer by one and return the resulting array of digits

/**
 * @param {number[]} digits
 * @return {number[]}
 */

var plusOne = function (digits) {
  let result = digits.slice();
  let len = result.length;

  for (let i = len - 1; i >= 0; i--) {
      result[i]++;

      if (result[i] > 9) {
          result[i] = 0;
      } else {
          return result;
      }
  }

  result = new Array(len + 1).fill(0);

  result[0] = 1;

  return result;
};