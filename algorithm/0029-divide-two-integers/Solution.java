class Solution {

    // Return the quotient after dividing dividend by divisor
    public int divide(int dividend, int divisor) {
        if (divisor == -1) {
            return (dividend == Integer.MIN_VALUE) ? Integer.MAX_VALUE : -dividend;
        }

        if (divisor == 1) {
            return dividend;
        }

        boolean isNegative = dividend < 0 != divisor < 0;

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;

        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor, multiple = 1;

            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            absDividend -= tempDivisor;
            quotient += multiple;
        }

        return isNegative ? -quotient : quotient;
    }
}