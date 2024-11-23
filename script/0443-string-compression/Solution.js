// Compress the array by grouping consecutive repeated characters

/**
 * @param {character[]} chars
 * @return {number}
 */

var compress = function (chars) {
  let grouped = "";

  for (let i = 0; i < chars.length;) {
      let char = chars[i];
      let count = 0;

      while (i < chars.length && chars[i] == char) {
          count++;
          i++;
      }

      grouped += char;

      if (count > 1) { grouped += count; }
  }

  grouped = grouped.split("");

  for (let i = 0; i < grouped.length; i++) {
      chars[i] = grouped[i];
  }

  return grouped.length;
};