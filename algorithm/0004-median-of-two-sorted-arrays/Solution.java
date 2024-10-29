// Return the median of the two sorted arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;

        int[] mergedArr = new int[size];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            mergedArr[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        while (i < nums1.length) {
            mergedArr[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArr[k++] = nums2[j++];
        }

        if (size % 2 != 0){
            return (double) mergedArr[size / 2];
        }

        return (double) (mergedArr[(size / 2) - 1] + mergedArr[size / 2]) / 2;
    }
}