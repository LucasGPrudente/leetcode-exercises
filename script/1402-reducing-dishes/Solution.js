// Return the maximum sum of like-time coefficient that the chef can obtain after preparing some amount of dishes

/**
 * @param {number[]} satisfaction
 * @return {number}
 */

var maxSatisfaction = function (satisfaction) {
  let len = satisfaction.length;

  satisfaction.sort((a, b) => { return a - b });

  // Only negatives
  if (satisfaction[len - 1] < 0) {
      return 0;
  }

  let max = Number.MIN_SAFE_INTEGER;

  for (let i = 0; i < len; i++) {
      let sum = 0;

      for (let j = i, t = 1; j < len; j++, t++) {
          sum += satisfaction[j] * t;
      }

      if (sum < max) {
          break;
      }

      max = sum;
  }

  return max;
};