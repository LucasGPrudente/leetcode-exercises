class Solution {

    // Return the Hamming distance between x and y
    public int hammingDistance(int x, int y) {
        int distance = 0;

        while (x > 0 || y > 0) {
            int bitX = x % 2;
            int bitY = y % 2;

            if (bitX != bitY) { distance++; }

            x /= 2;
            y /= 2;
        }

        return distance;
    }
}