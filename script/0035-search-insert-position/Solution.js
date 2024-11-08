// Return the index where it would be if it were inserted in order

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

var searchInsert = function (nums, target) {
  let lt = 0;
  let rt = nums.length - 1;

  while (lt <= rt) {
      let mid = parseInt((lt + rt) / 2);

      if (nums[mid] >= target) {
          rt = mid - 1;
      } else {
          lt = mid + 1;
      }
  }

  return lt;
};