// Return the number of segments in the string

/**
 * @param {string} s
 * @return {number}
 */

var countSegments = function (s) {
  s = s.trim().replace(/ +/g, " ");

  if (s.length == 0) { return 0; }

  return s.split(" ").length;
};