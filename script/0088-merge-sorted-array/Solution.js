// Merge nums1 and nums2 into a single array sorted in non-decreasing order

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */

var merge = function (nums1, m, nums2, n) {
  let result = [];

  let i = 0;
  let j = 0;
  let k = 0;

  while (i < m && j < n) {
      if (nums1[i] < nums2[j]) {
          result.push(nums1[i++]);
      } else if (nums1[i] > nums2[j]) {
          result.push(nums2[j++]);
      } else {
          result.push(nums1[i++]);
          result.push(nums2[j++]);
      }
  }

  while (i < m) {
      result.push(nums1[i++]);
  }

  while (j < n) {
      result.push(nums2[j++]);
  }

  for (i = 0; i < m + n; i++) {
      nums1[i] = result[i];
  }
};