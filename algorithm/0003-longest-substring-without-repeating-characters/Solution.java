class Solution {

    // Return the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;

        int[] count = new int[128];

        int i = 0;
        int j = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            count[c]++;

            while (count[c] > 1 && j < i) {
                count[s.charAt(j)]--;
                j++;
            }

            i++;

            longest = Math.max(longest, i - j);
        }

        return longest;
    }
}