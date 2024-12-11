// Return the longest substring without repeating characters

/**
 * @param {string} s
 * @return {number}
 */

var lengthOfLongestSubstring = function (s) {
  let longest = 0;

  let count = Array(128).fill(0);

  let i = 0;
  let j = 0;

  while (i < s.length) {
      let c = s.charCodeAt(i);

      count[c]++;

      while (count[c] > 1 && j < i) {
          count[s.charCodeAt(j)]--;
          j++;
      }

      i++;

      longest = Math.max(longest, i - j);
  }

  return longest;
};