// Converts a string to a 32-bit signed integer

/**
 * @param {string} s
 * @return {number}
 */

var myAtoi = function (s) {
  let i = 0;

  while (i < s.length) {
      let chr = s[i];

      if (chr != ' ') {
          if (chr == '.' || isLetter(chr)) {
              return 0;
          }

          break;
      }

      i++;
  }

  if (i == s.length) {
      return 0;
  }

  let num = 0;
  let len = 0;
  let negative = false;

  if (s[i] == '-') {
      negative = true;
      i++;
  } else if (s[i] == '+') {
      i++;
  }

  while (i < s.length) {
      let chr = s[i];

      if (!isDigit(chr) || len > 10) {
          break;
      }

      num *= 10;
      num += chr - '0';

      if (num > 0) {
          len++;
      }

      i++;
  }

  let max = Math.pow(2, 31) - 1;
  let min = Math.pow(2, 31) * -1;

  if (num > max) {
      return (negative) ? min : max;
  }

  return (negative) ? num * -1 : num;

  function isLetter(c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
  }

  function isDigit(c) {
      return c >= '0' && c <= '9';
  }
};