// Return the length of the last word in the string

/**
 * @param {string} s
 * @return {number}
 */

var lengthOfLastWord = function (s) {
  let phase = s.trim().replace(/  +/g, " ");
  let words = phase.split(" ");

  return words[words.length - 1].length;
};
