// Check if x is a palindrome

/**
 * @param {number} x
 * @return {boolean}
 */

var isPalindrome = function (x) {
  let num = x.toString();

  return num == num.split("").toReversed().join("");
};