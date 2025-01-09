class Solution {

    // Return the number of strings in words that contain pref as a prefix
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int len = pref.length();

        for (String word : words) {
            if (word.length() >= len) {
                String prefix = word.substring(0, len);

                if (prefix.equals(pref)) {
                    count++;
                }
            }
        }

        return count;
    }
}