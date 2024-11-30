// Create a prefix sum array

/**
 * @param {number[]} nums
 */

var NumArray = function (nums) {
  this.nums = nums;

  for (let i = 1; i < this.nums.length; i++) {
      this.nums[i] = this.nums[i] + this.nums[i - 1];
  }
};

// Returns the sum of the elements of nums between indices left and right

/**
* @param {number} left
* @param {number} right
* @return {number}
*/

NumArray.prototype.sumRange = function (left, right) {
  if (left == 0) { return this.nums[right]; }

  return this.nums[right] - this.nums[left - 1];
};

/**
* Your NumArray object will be instantiated and called as such:
* var obj = new NumArray(nums)
* var param_1 = obj.sumRange(left,right)
*/