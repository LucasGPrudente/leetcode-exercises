class Solution {

    // Merge nums1 and nums2 into a single array sorted in non-decreasing order
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                result[k++] = nums2[j++];
            } else {
                result[k++] = nums1[i++];
                result[k++] = nums2[j++];
            }
        }

        while (i < m) {
            result[k++] = nums1[i++];
        }

        while (j < n) {
            result[k++] = nums2[j++];
        }

        for (i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}