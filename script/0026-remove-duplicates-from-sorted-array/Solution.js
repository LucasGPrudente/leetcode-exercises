// Return the number of unique elements in nums

/**
 * @param {number[]} nums
 * @return {number}
 */

var removeDuplicates = function (nums) {
  let previous = nums[0];
  let i = 1;

  for (let num of nums) {
      if (num != previous) {
          nums[i] = num;
          previous = num;
          i++;
      }
  }

  return i;
};