// Sort the array without using the library's sort function

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */

var sortColors = function (nums) {
  let i = 0;

  let lt = 0;
  let rt = nums.length - 1;

  while (i <= rt && i < nums.length) {
      if (nums[i] == 0) {
          let tmp = nums[lt];
          nums[lt++] = nums[i];
          nums[i++] = tmp;
      } else if (nums[i] == 2) {
          let tmp = nums[rt];
          nums[rt--] = nums[i];
          nums[i] = tmp;
      } else {
          i++;
      }
  }
};