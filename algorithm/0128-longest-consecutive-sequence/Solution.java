class Solution {

    // Return the length of the longest consecutive elements sequence
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            int len = 1;

            while (i < n && nums[i] <= nums[i - 1] + 1) {
                if (nums[i] != nums[i - 1]) {
                    len++;
                }

                i++;
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}