// Return the minimal length of a subarray whose sum is greater than or equal to target

/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */

var minSubArrayLen = function (target, nums) {
  let lt = 0;
  let rt = 0;

  let len = nums.length;
  let ans = Number.MAX_VALUE;
  let sum = 0;

  while (rt < len) {
      if (nums[rt] >= target) {
          return 1;
      }

      sum += nums[rt];

      while (sum >= target && lt < rt) {
          ans = Math.min(ans, rt + 1 - lt);
          sum -= nums[lt];
          lt++;
      }

      rt++;
  }

  return (ans == Number.MAX_VALUE) ? 0 : ans;
};