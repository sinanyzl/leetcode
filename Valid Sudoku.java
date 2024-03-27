class Solution {
     public boolean isValidSudoku(char[][] board) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, 0, i, 8)) {
                return false;
            }
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            if (!isValid(board, 0, j, 8, j)) {
                return false;
            }
        }

        // Check each 3x3 sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid(board, i, j, i + 2, j + 2)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int rowStart, int colStart, int rowEnd, int colEnd) {
        HashSet<Character> set = new HashSet<>();

        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                char current = board[i][j];

                if (current != '.') {
                    if (!set.add(current)) {
                        return false; // Duplicate found
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example 1
        char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(board1)); // Output: true

        // Example 2
        char[][] board2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(solution.isValidSudoku(board2)); // Output: false
    }
}