// Return the reformatted license key

/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */

var licenseKeyFormatting = function (s, k) {
  s = s.replaceAll("-", "").toUpperCase();

  let groups = [];

  for (let i = s.length; i > 0; i -= k) {
      groups.push(s.substring(Math.max(0, i - k), i));
  }

  return groups.toReversed().join("-");
};