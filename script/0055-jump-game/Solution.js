// Return if you can reach the last index

/**
 * @param {number[]} nums
 * @return {boolean}
 */

var canJump = function (nums) {
  let jumped = new Array(nums.length).fill(false);

  search(nums, jumped, 0);

  return jumped[jumped.length - 1];

  // Mark possible jumps
  function search(nums, jumped, i) {
      jumped[i] = true;

      for (let j = i; j < nums.length && j <= i + nums[i]; j++) {
          if (jumped[j] == false) {
              search(nums, jumped, j);
          }
      }
  }
};