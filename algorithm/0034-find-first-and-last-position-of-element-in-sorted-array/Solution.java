class Solution {

    // In a sorted array, find the starting and ending position of a given target value
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[] { -1, -1 };

        int lt = 0;
        int rt = nums.length - 1;

        while (lt <= rt) {
            int md = (lt + rt) / 2;

            if (nums[md] >= target) {
                rt = md - 1;
            } else {
                lt = md + 1;
            }
        }

        if (nums.length == 0 || lt >= nums.length || nums[lt] != target) {
            return answer;
        }

        answer[0] = lt;

        rt = nums.length - 1;

        while (lt <= rt) {
            int md = (lt + rt) / 2;

            if (nums[md] == target) {
                lt = md + 1;
            } else {
                rt = md - 1;
            }
        }

        answer[1] = lt - 1;

        return answer;
    }
}