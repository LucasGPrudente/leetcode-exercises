// Return the number of strings in words that contain pref as a prefix

/**
 * @param {string[]} words
 * @param {string} pref
 * @return {number}
 */

var prefixCount = function (words, pref) {
  let count = 0;
  let len = pref.length;

  for (let word of words) {
      if (word.substring(0, len) === pref) {
          count++;
      }
  }

  return count;
};