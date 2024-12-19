class Solution {

    // Return the bitwise AND of all numbers in the range [left, right]
    public int rangeBitwiseAnd(int left, int right) {
        int count = 0;

        while (left != right) {
            left >>= 1;
            right >>= 1;
            count++;
        }

        return left << count;
    }
}