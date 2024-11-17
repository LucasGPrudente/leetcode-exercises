class Solution {

    // Return the number of arithmetic subarrays of nums
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int len = nums.length;

        if (len < 3) { return 0; }

        for (int i = 0; i <= len - 3; i++) {
            int dif = nums[i + 1] - nums[i];

            for (int j = i + 1; j <= len - 2; j++) {
                if (nums[j + 1] - nums[j] == dif) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}