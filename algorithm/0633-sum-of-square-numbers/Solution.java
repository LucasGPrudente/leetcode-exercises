class Solution {

    // Return whether there are two integers a and b such that a^2 + b^2 = c
    public boolean judgeSquareSum(int c) {
        long min = 1;
        long max = c;
        long mid = 0;

        while (min <= max) {
            mid = (min + max) / 2;

            if (mid * mid == c) {
                return true;
            } else if (mid * mid > c) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        long a = 0;
        long b = mid;

        while (a <= b) {
            long sum = (a * a) + (b * b);

            if (sum == c) {
                return true;
            } else if (sum > c) {
                b--;
            } else {
                a++;
            }
        }

        return false;
    }
}