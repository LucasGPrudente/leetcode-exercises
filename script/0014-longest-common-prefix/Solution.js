// Find the longest common prefix string amongst an array of strings

/**
 * @param {string[]} strs
 * @return {string}
 */

var longestCommonPrefix = function (strs) {
  for (let i = 0; i < strs[0].length; i++) {
      let c = strs[0][i];

      for (let str of strs) {
          if (i == str.length || str[i] != c) {
              return str.substring(0, i);
          }
      }
  }

  return strs[0];
};