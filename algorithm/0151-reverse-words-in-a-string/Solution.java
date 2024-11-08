class Solution {

    // Return a string of the words in reverse order concatenated by a single space
    public String reverseWords(String str) {
        List<String> words = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                int j = i;

                while (i < str.length()) {
                    if (str.charAt(i) == ' ') {
                        break;
                    }

                    i++;
                }

                words.add(0, str.substring(j, i));
            }
        }

        return String.join(" ", words);
    }
}