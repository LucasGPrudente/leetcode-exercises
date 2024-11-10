// Find a element that is strictly greater than its neighbors

/**
 * @param {number[]} nums
 * @return {number}
 */

var findPeakElement = function (nums) {
  let len = nums.length;

  if (len == 1 || nums[0] > nums[1]) { return 0; }

  if (nums[len - 2] < nums[len - 1]) { return len - 1; }

  let lt = 1;
  let rt = len - 1;

  while (lt <= rt) {
      let mid = parseInt((lt + rt) / 2);

      if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
          return mid;
      } else if (nums[mid] > nums[mid - 1]) {
          lt = mid + 1;
      } else {
          rt = mid - 1;
      }
  }
};