// Return the total number of seconds that Ashe is poisoned

/**
 * @param {number[]} timeSeries
 * @param {number} duration
 * @return {number}
 */

var findPoisonedDuration = function (timeSeries, duration) {
  let seconds = 0;

  for (let i = 0; i < timeSeries.length - 1; i++) {
      let interval = parseInt(timeSeries[i + 1] - timeSeries[i]);

      seconds += (interval > duration) ? duration : interval;
  }

  return seconds + duration;
};