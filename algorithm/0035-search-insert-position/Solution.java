class Solution {

    // Return the index where it would be if it were inserted in order
    public int searchInsert(int[] nums, int target) {
        int lt = 0;
        int rt = nums.length - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (nums[mid] >= target) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return lt;
    }
}