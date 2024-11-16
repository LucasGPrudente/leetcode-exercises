class Solution {

    // Return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int zeros = 0;
        int product = 1;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                product *= nums[i];
            }
        }

        int[] newNums = new int[len];

        if (zeros == 0) {
            for (int i = 0; i < len; i++) {
                newNums[i] = product / nums[i];
            }
        } else if (zeros == 1) {
            for (int i = 0; i < len; i++) {
                newNums[i] = (nums[i] == 0) ? product : 0;
            }
        }

        return newNums;
    }
}