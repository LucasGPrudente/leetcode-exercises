class Solution {

    // Determine if a 9 x 9 Sudoku board is valid
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] square = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = (board[i][j] - '0') - 1;
                    int sqr = (j / 3) + (3 * (i / 3));

                    if (row[i][num] || column[j][num] || square[sqr][num]) {
                        return false;
                    }

                    row[i][num] = true;
                    column[j][num] = true;
                    square[sqr][num] = true;
                }
            }
        }

        return true;
    }
}