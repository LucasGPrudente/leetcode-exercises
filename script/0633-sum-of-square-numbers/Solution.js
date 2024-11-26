// Return whether there are two integers a and b such that a^2 + b^2 = c

/**
 * @param {number} c
 * @return {boolean}
 */

var judgeSquareSum = function (c) {
  let lt = 0;
  let rt = c;

  while ((rt * rt) > c) {
      rt = parseInt(rt / 2);
  }

  rt *= 2;

  while (lt <= rt) {
      const sum = (lt * lt) + (rt * rt);

      if (sum === c) {
          return true;
      } else if (sum < c) {
          lt++;
      } else {
          rt--;
      }
  }

  return false;
};