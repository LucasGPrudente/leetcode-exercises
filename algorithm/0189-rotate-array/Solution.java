class Solution {

    // Rotate the array to the right by k steps
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if (len == k || k == 0) { return; }

        int[] clone = nums.clone();

        for (int i = 0, j = len - k; j < len; i++, j++) {
            nums[i] = clone[j];
        }

        for (int i = k, j = 0; i < len; i++, j++) {
            nums[i] = clone[j];
        }
    }
}