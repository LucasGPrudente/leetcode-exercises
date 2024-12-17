// Return the resulting string

/**
 * @param {string} s
 * @return {string}
 */

var decodeString = function (s) {
  let res = "";

  for (let i = 0; i < s.length; i++) {
      if (s[i] == ']') {
          let j = res.length - 1;

          while (j > 0 && res[j] != '[') {
              j--;
          }

          let k = j - 1;

          while (k >= 0 && charIsDigit(res[k])) {
              k--;
          }

          let n = Number(res.substring(k + 1, j));

          res = res.substring(0, k + 1) + res.substring(j + 1, res.length).repeat(n);
      } else {
          res += s[i];
      }
  }

  return res;

  function charIsDigit(c) {
      return c >= '0' && c <= '9';
  }
};