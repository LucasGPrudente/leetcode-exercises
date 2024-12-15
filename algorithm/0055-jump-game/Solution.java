class Solution {

    // Return if you can reach the last index
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] jumped = new boolean[len];

        search(nums, jumped, len, 0);

        return jumped[len - 1];
    }

    // Mark possible jumps
    public void search(int[] nums, boolean[] jumped, int len, int i) {
        jumped[i] = true;

        for (int j = i; j < len && j <= i + nums[i]; j++) {
            if (jumped[j] == false) {
                search(nums, jumped, len, j);
            }
        }
    }
}