// Arrange the list of non-negative integers nums such that they form the largest number

/**
 * @param {number[]} nums
 * @return {string}
 */

var largestNumber = function (nums) {
  let answer = nums.map((num) => num.toString());

  answer.sort((a, b) => (b + a) - (a + b));

  return (answer[0] == "0") ? "0" : answer.join("");
};