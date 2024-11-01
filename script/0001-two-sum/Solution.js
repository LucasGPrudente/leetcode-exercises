// Return indices of the two numbers that when added result in the target

/**
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function(nums, target) {
  let map = new Map();

  for (let i = 0; i < nums.length; i++) {
      if (map.has(nums[i])) {
          return [map.get(nums[i]), i];
      }

      map.set(target - nums[i], i);
  }

  return [-1, -1];
};