// Check if there exist two indices i and j such that arr[i] == 2 * arr[j]

/**
 * @param {number[]} arr
 * @return {boolean}
 */

var checkIfExist = function (arr) {
  let nums = [];

  for (let x of arr) {
      if (nums.includes(x * 2) || (x % 2 == 0 && nums.includes(x / 2))) { return true; }

      nums.push(x);
  }

  return false;
};