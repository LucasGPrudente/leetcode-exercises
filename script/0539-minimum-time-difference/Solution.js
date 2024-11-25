// Return the minimum minutes difference between any two time-points in the list

/**
 * @param {string[]} timePoints
 * @return {number}
 */

var findMinDifference = function (timePoints) {
  let set = new Set();

  for (let time of timePoints) {
      let hour = parseInt(time.substring(0, 2));
      let minute = parseInt(time.substring(3, 5));

      let timeInMinutes = (hour * 60) + minute;

      if (set.has(timeInMinutes)) { return 0; }

      set.add(timeInMinutes);
  }

  let list = Array.from(set);

  list.sort((a, b) => a - b);

  list.push(list[0] + (24 * 60));

  let minDif = Number.MAX_VALUE;

  for (let i = 1; i < list.length; i++) {
      minDif = Math.min(minDif, list[i] - list[i - 1]);
  }

  return minDif;
};