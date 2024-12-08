// Return the Hamming distance between x and y

/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */

var hammingDistance = function (x, y) {
  if (x < y) { return hammingDistance(y, x); }

  let distance = 0;

  let binX = x.toString(2);
  let binY = y.toString(2).padStart(binX.length, 0);

  for (let i = 0; i < binX.length; i++) {
      if (binX[i] != binY[i]) { distance++; }
  }

  return distance;
};