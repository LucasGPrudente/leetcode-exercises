// Return an array of all the integers that appears twice

/**
 * @param {number[]} nums
 * @return {number[]}
 */

var findDuplicates = function (nums) {
  let duplicates = [];
  let count = new Array(nums.length + 1).fill(0);

  for (let n of nums) {
      count[n]++;

      if (count[n] > 1) { duplicates.push(n); }
  }

  return duplicates;
};