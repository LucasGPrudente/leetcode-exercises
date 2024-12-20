class Solution {

    // Return how many distinct ways can you climb to the top
    public int climbStairs(int n) {
        if (n <= 2) { return n; }

        int ways = 0;
        int[] sequence = { 1, 2 };

        for (int x = 0; x < n - 2; x++) {
            ways = sequence[0] + sequence[1];
            sequence[0] = sequence[1];
            sequence[1] = ways;
        }

        return ways;
    }
}