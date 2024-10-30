// Return the median of the two sorted arrays

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

var findMedianSortedArrays = function (nums1, nums2) {
  let size = nums1.length + nums2.length;

  let mergedArr = [];

  let i = 0;
  let j = 0;

  while (i < nums1.length && j < nums2.length) {
      mergedArr.push((nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++]);
  }

  while (i < nums1.length) {
      mergedArr.push(nums1[i++]);
  }

  while (j < nums2.length) {
      mergedArr.push(nums2[j++]);
  }

  if (size % 2 != 0) {
      return mergedArr[parseInt(size / 2)];
  }

  return (mergedArr[parseInt(size / 2)] + mergedArr[parseInt((size / 2) - 1)]) / 2;
};