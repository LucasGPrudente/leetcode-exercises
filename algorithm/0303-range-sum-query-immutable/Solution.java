class NumArray {
    int[] prefixSum;

    // Create a prefix sum array
    public NumArray(int[] nums) {
        prefixSum = nums;

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i] + prefixSum[i - 1];
        }
    }

    // Returns the sum of the elements of nums between indices left and right
    public int sumRange(int left, int right) {
        return (left == 0) ? prefixSum[right] : prefixSum[right] - prefixSum[left - 1];
    }
}