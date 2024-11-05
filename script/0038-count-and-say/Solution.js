// Return the n-th element of the count-and-say sequence

/**
 * @param {number} n
 * @return {string}
 */

var countAndSay = function (n) {
  let seq = "1";

  for (let i = 1; i < n; i++) {
      seq = count(seq);
  }

  return seq;

  // Count each sequence of numbers and append to the string
  function count(currSeq) {
      let newSeq = "";
      let chr = currSeq.split("");

      for (let i = 0; i < chr.length;) {
          let j = i;

          while (i < chr.length && chr[i] == chr[j]) {
              i++;
          }

          newSeq += (i - j) + chr[j];
      }

      return newSeq;
  }
};