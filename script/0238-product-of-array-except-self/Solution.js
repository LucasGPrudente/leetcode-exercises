// Return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]

/**
 * @param {number[]} nums
 * @return {number[]}
 */

var productExceptSelf = function (nums) {
  let zeros = 0;
  let product = 1;

  for (let n of nums) {
      if (n == 0) {
          zeros++;
      } else {
          product *= n;
      }
  }

  if (zeros == 0) { return noZeros(nums, product); }

  if (zeros == 1) { return oneZero(nums, product); }

  return Array(nums.length).fill(0);

  function noZeros(nums, product) {
      let answer = [];

      for (let n of nums) {
          answer.push(parseInt(product / n));
      }

      return answer;
  };

  function oneZero(nums, product) {
      let answer = [];

      for (let n of nums) {
          answer.push((n == 0) ? product : 0);
      }

      return answer;
  };
};