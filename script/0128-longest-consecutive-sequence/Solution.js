// Return the length of the longest consecutive elements sequence

/**
 * @param {number[]} nums
 * @return {number}
 */

var longestConsecutive = function (nums) {
  if (nums.length == 0) {
      return 0;
  }

  let map = new Map();

  for (let num of nums) {
      map.set(num, false);
  }

  let maxLen = 1;

  for (const [key, value] of map) {
      if (!value) {
          let num = key;
          let len = 1;

          while (map.has(num - 1)) {
              num--;
          }

          while (map.has(num + len)) {
              map.set(num + len, true);
              len++;
          }

          if (len > maxLen) {
              maxLen = len;
          }
      }
  }

  return maxLen;
};