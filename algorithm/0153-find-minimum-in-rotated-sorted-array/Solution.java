class Solution {

    // Return the minimum element of this array
    public int findMin(int[] nums) {
        int len = nums.length;

        if (nums[len - 1] > nums[0] || len == 1) { return nums[0]; }

        int lt = 0;
        int rt = len - 1;

        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (nums[mid] > nums[mid + 1]) { return nums[mid + 1]; }

            if (nums[mid] < nums[mid - 1]) { return nums[mid]; }

            if (nums[mid] < nums[rt]) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return -1;
    }
}