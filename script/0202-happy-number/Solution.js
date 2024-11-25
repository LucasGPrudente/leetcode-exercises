// Determine if a number n is happy

/**
 * @param {number} n
 * @return {boolean}
 */

var isHappy = function (n) {
  let previous = new Set();

  while (n > 3 && !previous.has(n)) {
      previous.add(n);

      let sum = 0;

      while (n > 0) {
          sum += Math.pow(n % 10, 2);
          n = parseInt(n / 10);
      }

      n = sum;
  }

  return n == 1;
};