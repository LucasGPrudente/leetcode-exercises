class Solution {

    // Sort the array without using the library's sort function
    public void sortColors(int[] nums) {
        int i = 0;

        int lt = 0;
        int rt = nums.length - 1;

        while (i <= rt && i < nums.length) {
            if (nums[i] == 0) {
                int tmp = nums[lt];
                nums[lt] = nums[i];
                nums[i] = tmp;

                lt++;
                i++;
            } else if (nums[i] == 2) {
                int tmp = nums[rt];
                nums[rt] = nums[i];
                nums[i] = tmp;

                rt--;
            } else {
                i++;
            }
        }
    }
}