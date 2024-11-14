// Rotate the array to the right by k steps

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */

var rotate = function (nums, k) {
  let len = nums.length;

  k = k % len;

  if (len == k || k == 0) { return; }

  let copy = nums.slice(0, len - k);

  let i = 0;
  let j = len - k;

  while (j < len) {
      nums[i++] = nums[j++];
  }

  for (let x of copy) {
      nums[i++] = x;
  }
};