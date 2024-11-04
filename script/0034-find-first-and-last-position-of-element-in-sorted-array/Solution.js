// In a sorted array, find the starting and ending position of a given target value

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var searchRange = function (nums, target) {
  let lt = 0;
  let rt = nums.length - 1;

  while (lt <= rt) {
      let md = parseInt((lt + rt) / 2);

      if (nums[md] >= target) {
          rt = md - 1;
      } else {
          lt = md + 1;
      }
  }

  if (nums.length == 0 || lt >= nums.length || nums[lt] != target) {
      return [-1, -1];
  }

  let first = lt;

  rt = nums.length - 1;

  while (lt <= rt) {
      let md = parseInt((lt + rt) / 2);

      if (nums[md] == target) {
          lt = md + 1;
      } else {
          rt = md - 1;
      }
  }

  return [first, lt - 1];
};