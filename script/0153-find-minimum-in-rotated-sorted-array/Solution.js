// Return the minimum element of this array

/**
 * @param {number[]} nums
 * @return {number}
 */

var findMin = function (nums) {
  let len = nums.length;

  if (nums[len - 1] > nums[0] || len == 1) { return nums[0]; }

  let lt = 0;
  let rt = len - 1;

  while (lt <= rt) {
      let md = parseInt((lt + rt) / 2);

      if (nums[md + 1] < nums[md]) { return nums[md + 1]; }

      if (nums[md] < nums[md - 1]) { return nums[md]; }

      if (nums[md] < nums[rt]) {
          rt = md - 1;
      } else {
          lt = md + 1;
      }
  }
};