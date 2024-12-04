class Solution {

    // Return the modified string after the spaces have been added
    public String addSpaces(String s, int[] spaces) {
        StringBuilder output = new StringBuilder();
        int j = 0;

        for (int i = 0; i < spaces.length; i++) {
            while (j < spaces[i]) {
                output.append(s.charAt(j));
                j++;
            }

            output.append(" ");
        }

        while (j < s.length()) {
            output.append(s.charAt(j));
            j++;
        }

        return output.toString();
    }
}