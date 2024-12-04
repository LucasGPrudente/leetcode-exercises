// Return the modified string after the spaces have been added

/**
 * @param {string} s
 * @param {number[]} spaces
 * @return {string}
 */

var addSpaces = function (s, spaces) {
  let output = "";

  output += s.substring(0, spaces[0]) + " ";

  for (let i = 0; i < spaces.length - 1; i++) {
      output += s.substring(spaces[i], spaces[i + 1]) + " ";
  }

  output += s.substring(spaces[spaces.length - 1], s.length);

  return output;
};