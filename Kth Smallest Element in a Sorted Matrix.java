class Solution {
     public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countSmallerOrEqual(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static int countSmallerOrEqual(int[][] matrix, int target) {
        int count = 0;
        int n = matrix.length;
        int row = n - 1;
        int col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= target) {
                count += row + 1;  // Increment count and move to the next column
                col++;
            } else {
                row--;  // Move to the previous row
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k1 = 8;
        System.out.println("Example 1: " + kthSmallest(matrix1, k1));  // Output: 13

        int[][] matrix2 = {{-5}};
        int k2 = 1;
        System.out.println("Example 2: " + kthSmallest(matrix2, k2));  // Output: -5
    }
}