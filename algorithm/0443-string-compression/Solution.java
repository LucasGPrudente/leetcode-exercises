class Solution {

    // Compress the array by grouping consecutive repeated characters
    public int compress(char[] chars) {
        int len = chars.length;

        int i = 0;
        int j = 0;

        while (i < len) {
            char chr = chars[i];
            int count = 0;

            while (i < len && chars[i] == chr) {
                count++;
                i++;
            }

            chars[j] = chr;
            j++;

            if (count > 1 && j < len) {
                for (char n : String.valueOf(count).toCharArray()) {
                    chars[j] = n;
                    j++;
                }
            }
        }

        return j;
    }
}