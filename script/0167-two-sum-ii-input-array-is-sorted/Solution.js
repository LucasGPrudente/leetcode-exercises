// Find two numbers such that they add up to a specific target number

/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function (nums, target) {
  let lt = 0;
  let rt = nums.length - 1;

  while (lt < rt) {
      if (nums[lt] + nums[rt] < target) {
          lt++;
      } else if (nums[lt] + nums[rt] > target) {
          rt--;
      } else {
          return [lt + 1, rt + 1];
      }
  }

  return [-1, -1];
};