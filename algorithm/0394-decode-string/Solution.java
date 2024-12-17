class Solution {

    // Return the resulting string
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                int j = res.length() - 1;

                while (j > 0 && res.charAt(j) != '[') {
                    j--;
                }

                int k = j - 1;
                int n = 0;
                int e = 1;

                while (k >= 0 && Character.isDigit(res.charAt(k))) {
                    n += (res.charAt(k) - '0') * e;
                    e *= 10;
                    k--;
                }

                StringBuilder temp = new StringBuilder();

                temp.append(res.substring(0, k + 1));
                temp.append(res.substring(j + 1, res.length()).repeat(n));

                res = temp;
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}