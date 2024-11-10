class Solution {

    // Find a element that is strictly greater than its neighbors
    public int findPeakElement(int[] nums) {
        int len = nums.length;

        if (len == 1 || nums[0] > nums[1]) {
            return 0;
        }

        if (nums[len - 2] < nums[len - 1]) {
            return len - 1;
        }

        int lt = 1;
        int rt = len - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return -1;
    }
}