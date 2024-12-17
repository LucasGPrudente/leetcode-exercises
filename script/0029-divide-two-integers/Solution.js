// Return the quotient after dividing dividend by divisor

/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */

var divide = function (dividend, divisor) {
    const max = Math.pow(2, 31) - 1;
    const min = Math.pow(2, 31) * -1;

    if (divisor == -1) {
        return (dividend == min) ? max : -dividend;
    }

    if (divisor == 1) {
        return dividend;
    }

    const isNegative = dividend < 0 != divisor < 0;
    let result = 0;

    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);

    while (dividend >= divisor) {
        let multiple = 1;
        let val = divisor;

        while (dividend >= val + val) {
            val += val;
            multiple += multiple;
        }

        dividend -= val;
        result += multiple;
    }

    return isNegative ? -result : result;
};