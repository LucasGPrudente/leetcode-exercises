// Return the sum of a and b as a binary string

/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */

var addBinary = function (a, b) {
  let result = "";

  let carry = 0;
  let i = a.length - 1;
  let j = b.length - 1;

  while (i >= 0 || j >= 0 || carry > 0) {
      let bitA = (i >= 0) ? parseInt(a[i]) : 0;
      let bitB = (j >= 0) ? parseInt(b[j]) : 0;

      let sum = bitA + bitB + carry;

      result = (sum % 2) + result;
      carry = Math.floor(sum / 2);

      i--;
      j--;
  }

  return result;
};