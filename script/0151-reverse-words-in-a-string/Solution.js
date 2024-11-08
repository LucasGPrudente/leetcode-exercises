// Return a string of the words in reverse order concatenated by a single space

/**
 * @param {string} s
 * @return {string}
 */

var reverseWords = function (s) {
  const phase = s.trim().replace(/  +/g, " ");
  const words = phase.split(" ");

  return words.toReversed().join(" ");
};