// Return how many days to a warmer temperature for each day

/**
 * @param {number[]} temps
 * @return {number[]}
 */

var dailyTemperatures = function (temps) {
  let len = temps.length;
  let ans = new Array(len).fill(0);
  let day = new Array(len).fill(0);

  for (let i = 0, j = 0; i < len; i++) {
      while (j >= 0 && temps[i] > temps[day[j]]) {
          ans[day[j]] = i - day[j];
          j--;
      }

      j++;
      day[j] = i;
  }

  return ans;
};