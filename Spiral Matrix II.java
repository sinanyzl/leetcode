class Solution {
     public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right in the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse from top to bottom in the rightmost column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse from right to left in the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Traverse from bottom to top in the leftmost column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[][] result1 = solution.generateMatrix(3);
        printMatrix(result1);

        int[][] result2 = solution.generateMatrix(1);
        printMatrix(result2);
    }

    // Helper method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}