class Solution {
   public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D array to store the minimum operations for each subproblem
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the dp array for base cases
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If word1 is empty, insert all characters from word2
                } else if (j == 0) {
                    dp[i][j] = i; // If word2 is empty, delete all characters from word1
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation needed
                } else {
                    // Choose the minimum of insert, delete, or replace operations
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }

        // The final result is stored in the bottom-right cell of the dp array
        return dp[m][n];
    }
       public static void main(String[] args) {
        Solution solution = new Solution();

        String word1 = "horse";
        String word2 = "ros";
        System.out.println(solution.minDistance(word1, word2)); // Output: 3

        word1 = "intention";
        word2 = "execution";
        System.out.println(solution.minDistance(word1, word2)); // Output: 5
    }
}