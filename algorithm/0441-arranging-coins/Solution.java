class Solution {

    // Return the number of complete rows of the staircase you will build
    public int arrangeCoins(int n) {
        int row = 1;

        while (n >= row) {
            n -= row;
            row++;
        }

        return row - 1;
    }
}