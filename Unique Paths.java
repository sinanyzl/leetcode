class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of unique paths at each position
        int[][] dp = new int[m][n];

        // Initialize the top row and left column with 1, as there is only one way to reach any cell in the top row or left column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill in the rest of the array using the recurrence relation dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The result is stored in the bottom-right corner of the array
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.uniquePaths(3, 7)); // Output: 28
        System.out.println(solution.uniquePaths(3, 2)); // Output: 3
    }