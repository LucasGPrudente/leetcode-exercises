class Solution {

    // Return an integer num in string of its base 7 representation
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder base7 = new StringBuilder();
        boolean negative = num < 0;

        if (negative) {
            num *= -1;
        }

        while (num > 0) {
            base7.append(num % 7);
            num /= 7;
        }

        if (negative) {
            base7.append("-");
        }

        return base7.reverse().toString();
    }
}