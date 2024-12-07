// Return if the string can be constructed by multiple copies of a substring

/**
 * @param {string} s
 * @return {boolean}
 */

var repeatedSubstringPattern = function (s) {
  let len = s.length;

  for (let idx = Math.floor(len / 2); idx > 0; idx--) {
      let num = len / idx;

      if (Number.isInteger(num) && s === s.substring(0, idx).repeat(num)) { return true; }
  }

  return false;
};