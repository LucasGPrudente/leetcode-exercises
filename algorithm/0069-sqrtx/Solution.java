class Solution {

    // Return the square root of x rounded down to the nearest integer
    public int mySqrt(int x) {
        long num = x;

        while (num * num > x) {
            num /= 2;
        }

        while (num * num <= x) {
            num++;
        }

        return (int) num - 1;
    }
}