class Solution {

    // Increment the large integer by one and return the resulting array of digits
    public int[] plusOne(int[] digits) {
        int[] result = digits.clone();
        int len = result.length;

        for (int i = len - 1; i >= 0; i--) {
            result[i]++;

            if (result[i] > 9) {
                result[i] = 0;
            } else {
                return result;
            }
        }

        result = new int[len + 1];

        result[0] = 1;

        return result;
    }
}