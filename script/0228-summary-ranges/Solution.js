// Return the smallest sorted list of ranges that cover all the numbers in the array exactly

/**
 * @param {number[]} nums
 * @return {string[]}
 */

var summaryRanges = function (nums) {
  let ranges = [];

  for (let j = 0; j < nums.length; j++) {
      let i = j;

      while (j < nums.length - 1 && nums[j] == nums[j + 1] - 1) {
          j++;
      }

      ranges.push((i == j) ? nums[i] + "" : nums[i] + "->" + nums[j]);
  }

  return ranges;
};