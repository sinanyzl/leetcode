class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Solution climbingStairs = new Solution();

        int n1 = 2;
        int result1 = climbingStairs.climbStairs(n1);
        System.out.println("For n = " + n1 + ", ways = " + result1);

        int n2 = 3;
        int result2 = climbingStairs.climbStairs(n2);
        System.out.println("For n = " + n2 + ", ways = " + result2);
    }
}