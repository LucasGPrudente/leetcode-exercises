// Return if string is a palindrome

/**
 * @param {string} str
 * @return {boolean}
 */

var isPalindrome = function (str) {
  let chr = str.replace(/[\W_]/g, "").toLowerCase().split("");

  return chr.join("") == chr.toReversed().join("");
};