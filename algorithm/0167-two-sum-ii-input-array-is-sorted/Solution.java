class Solution {

    // Find two numbers such that they add up to a specific target number
    public int[] twoSum(int[] nums, int target) {
        int lt = 0;
        int rt = nums.length - 1;

        while (lt < rt) {
            if (nums[lt] + nums[rt] < target) {
                lt++;
            } else if (nums[lt] + nums[rt] > target) {
                rt--;
            } else {
                return new int[] { lt + 1, rt + 1 };
            }
        }

        return new int[] { -1, -1 };
    }
}