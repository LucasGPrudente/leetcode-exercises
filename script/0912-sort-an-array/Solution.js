// Sort the array in ascending order and return it

/**
 * @param {number[]} nums
 * @return {number[]}
 */

var sortArray = function (nums) {
  let negative = nums.filter((n) => { return n < 0; }).map((n) => n * -1);
  let positive = nums.filter((n) => { return n >= 0; });

  negative = radixSort(negative);
  positive = radixSort(positive);

  negative = negative.toReversed().map((n) => n * -1);

  return negative.concat(positive);

  function radixSort(arr) {
      const max = Math.max(...arr);
      let exp = 1;

      while (Math.floor(max / exp) > 0) {
          countSort(arr, exp);
          exp *= 10;
      }

      return arr;
  }

  function countSort(arr, exp) {
      const len = arr.length;

      let output = new Array(len).fill(0);
      let count = new Array(10).fill(0);

      for (let i = 0; i < len; i++) {
          const digit = Math.floor(arr[i] / exp) % 10;
          count[digit]++;
      }

      for (let i = 1; i < 10; i++) {
          count[i] += count[i - 1];
      }

      for (let i = len - 1; i >= 0; i--) {
          const digit = Math.floor(arr[i] / exp) % 10;
          output[count[digit] - 1] = arr[i];
          count[digit]--;
      }

      for (let i = 0; i < len; i++) {
          arr[i] = output[i];
      }
  }
};