class Solution {

    // Converts a string to a 32-bit signed integer
    public int myAtoi(String s) {
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (c != ' ') {
                if (c == '.' || Character.isLetter(c)) {
                    return 0;
                }

                break;
            }

            i++;
        }

        if (i == s.length()) {
            return 0;
        }

        long num = 0;
        int numLen = 0;
        boolean negative = false;

        if (s.charAt(i) == '-') {
            negative = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && numLen < 11) {
            char c = s.charAt(i);

            if (!Character.isDigit(c)) {
                break;
            }

            num *= 10;
            num += c - '0';

            if (num > 0) {
                numLen++;
            }

            i++;
        }

        if (num > Integer.MAX_VALUE) {
            return (negative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return (negative) ? (int) num * -1 : (int) num;
    }
}