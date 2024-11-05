class Solution {

    // Return the n-th element of the count-and-say sequence
    public String countAndSay(int n) {
        String sequence = "1";

        for (int i = 1; i < n; i++) {
            sequence = count(sequence);
        }

        return sequence;
    }

    // Count each sequence of numbers and append to the string
    public String count(String currSeq) {
        StringBuilder newSeq = new StringBuilder("");
        char[] chr = currSeq.toCharArray();

        for (int i = 0; i < chr.length;) {
            int j = i;

            while (i < chr.length && chr[i] == chr[j]) {
                i++;
            }

            newSeq.append(i - j).append(chr[j]);
        }

        return newSeq.toString();
    }
}