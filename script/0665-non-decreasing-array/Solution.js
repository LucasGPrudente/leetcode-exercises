// Check if the array could become non-decreasing by modifying at most one element

/**
 * @param {number[]} nums
 * @return {boolean}
 */

var checkPossibility = function (nums) {
  let idx = -1;

  for (let i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1]) {
          if (idx > -1) { return false; }

          idx = i - 1;
      }
  }

  if (idx == -1) { return true; }

  if (idx == 0 || idx == nums.length - 2) { return true; }

  return nums[idx - 1] <= nums[idx + 1] || nums[idx] <= nums[idx + 2];
};