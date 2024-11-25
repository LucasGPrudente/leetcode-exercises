// Return the majority element

/**
 * @param {number[]} nums
 * @return {number}
 */

var majorityElement = function (nums) {
  let count = {};

  for (const num of nums) {
      count[num] = count[num] ? count[num] + 1 : 1;

      if (count[num] > nums.length / 2) { return num; }
  }
};