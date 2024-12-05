class Solution {

    // Return the sum of a and b as a binary string
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        StringBuilder sum = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0) {
            if (a.charAt(i) == '1') { carry++; }

            if (j >= 0 && b.charAt(j) == '1') { carry++; }

            if (carry == 0) {
                sum.append("0");
            } else if (carry == 1) {
                carry = 0;
                sum.append("1");
            } else if (carry == 2) {
                carry = 1;
                sum.append("0");
            } else {
                carry = 1;
                sum.append("1");
            }

            i--;
            j--;
        }

        if (carry == 1) { sum.append("1"); }

        return sum.reverse().toString();
    }
}