// Check if the input string is valid

/**
 * @param {string} s
 * @return {boolean}
 */

var isValid = function (s) {
  let table = {
      ')': '(',
      ']': '[',
      '}': '{'
  };

  let sequence = [];

  for (let c of s.split("")) {
      if (c == '(' || c == '[' || c == '{') {
          sequence.push(c);
      } else if (sequence.length > 0 && sequence[sequence.length - 1] == table[c]) {
          sequence.pop();
      } else {
          return false;
      }
  }

  return sequence.length == 0;
};