// Return an array [L, W] where L and W are the length and width of the web page

/**
 * @param {number} area
 * @return {number[]}
 */

var constructRectangle = function (area) {
  let sqrt = parseInt(Math.sqrt(area));

  if (sqrt * sqrt == area) { return [sqrt, sqrt]; }

  let dim = [area, 1];

  for (let w = 2; w <= sqrt; w++) {
      if (area % w === 0) {
          let l = area / w;

          if (l - w < dim[0] - dim[1]) { dim = [l, w]; }
      }
  }

  return dim;
};