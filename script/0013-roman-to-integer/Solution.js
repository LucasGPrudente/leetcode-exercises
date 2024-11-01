// Convert the roman numeral to an integer

/**
 * @param {string} s
 * @return {number}
 */

var romanToInt = function (s) {
  let num = 0;
  let previousNum = 0;

  let values = { 'I': 1, 'V': 5, 'X': 10, "L": 50, 'C': 100, 'D': 500, 'M': 1000 }

  for (let i = s.length - 1; i >= 0; i--) {
      let val = values[s[i]];

      if (val >= previousNum) {
          num += val;
      } else {
          num -= val;
      }

      previousNum = val;
  }

  return num;
};