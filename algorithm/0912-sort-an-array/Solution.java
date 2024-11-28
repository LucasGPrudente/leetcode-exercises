class Solution {

    // Sort the array in ascending order and return it
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int num : nums) {
            count[num - min]++;
        }

        for (int i = 0, j = 0; i < range; i++) {
            while (count[i] > 0) {
                nums[j] = i + min;
                count[i]--;
                j++;
            }
        }

        return nums;
    }
}