class Solution {

    // Return the minimal length of a subarray whose sum is greater than or equal to target
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int[] sum = new int[len + 1];

        for (int i = 0; i < len; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        if (sum[len] < target) {
            return 0;
        }

        if (sum[len] == target) {
            return len;
        }

        int hi = 0;
        int lo = 0;
        int minLen = len;

        while (hi <= len) {
            while (sum[hi] - sum[lo] >= target && lo < hi) {
                minLen = Math.min(minLen, hi - lo);
                lo++;
            }

            hi++;
        }

        return minLen;
    }
}