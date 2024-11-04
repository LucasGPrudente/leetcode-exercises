// Find the longest common prefix string amongst an array of strings

class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != c) {
                    return str.substring(0, i);
                }
            }
        }

        return strs[0];
    }
}