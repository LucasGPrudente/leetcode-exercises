// Return an integer num in  string of its base 7 representation

/**
 * @param {number} num
 * @return {string}
 */

var convertToBase7 = function (num) {
  if (num == 0) {
      return "0";
  }

  let base7 = [];
  let negative = num < 0;

  if (negative) {
      num *= -1;
  }

  while (num > 0) {
      base7.push(num % 7);
      num = parseInt(num / 7);
  }

  if (negative) {
      base7.push("-");
  }

  return base7.reverse().join("");
};