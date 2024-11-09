class Solution {

    // Return the length of the last word in the string
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (s.charAt(i) == ' ') {
            i--;
        }

        int len = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}