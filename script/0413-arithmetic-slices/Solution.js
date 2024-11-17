// Return the number of arithmetic subarrays of nums

/**
 * @param {number[]} nums
 * @return {number}
 */

var numberOfArithmeticSlices = function (nums) {
  let count = 0;
  let len = nums.length;

  if (len > 2) {
      for (let i = 0; i < len - 2; i++) {
          let dif = nums[i + 1] - nums[i];

          for (let j = i + 1; j < len - 1; j++) {
              if (dif != nums[j + 1] - nums[j]) { break; }

              count++;
          }
      }
  }

  return count;
};