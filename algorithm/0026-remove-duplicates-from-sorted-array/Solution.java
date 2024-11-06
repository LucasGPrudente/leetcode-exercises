class Solution {

    // Return the number of unique elements in nums
    public int removeDuplicates(int[] nums) {
        int previous = nums[0];
        int i = 1;

        for (int num : nums) {
            if (num != previous) {
                nums[i] = num;
                previous = num;
                i++;
            }
        }

        return i;
    }
}