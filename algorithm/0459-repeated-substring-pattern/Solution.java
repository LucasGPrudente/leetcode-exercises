class Solution {

    // Return if the string can be constructed by multiple copies of a substring
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int idx = (int) Math.floor(len / 2);

        while (idx > 0) {
            if (len % idx == 0) {
                String sub = s.substring(0, idx);
                int num = len / idx;

                if (s.equals(sub.repeat(num))) { return true; }
            }

            idx--;
        }

        return false;
    }
}