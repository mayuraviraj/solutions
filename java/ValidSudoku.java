// Use boolean array with index adjusted to number value
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowCheck = new boolean[9][9];
        boolean[][] colCheck = new boolean[9][9];
        boolean[][] boxCheck = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int boxIndex = (i / 3) * 3 + j / 3;
                    if (rowCheck[i][num] || colCheck[num][j] || boxCheck[boxIndex][num]) {
                        return false;
                    }
                    rowCheck[i][num] = true;
                    colCheck[j][num] = true;
                    boxCheck[boxIndex][num] = true;
                }
            }
        }

        return true;
    }
}