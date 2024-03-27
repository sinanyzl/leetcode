class Solution {
   public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        
        // Continuously divide by 2, 3, and 5 until no longer divisible
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        
        // If after division n becomes 1, then it's an ugly number
        return n == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int n1 = 6;
        System.out.println("Is " + n1 + " an ugly number? " + solution.isUgly(n1)); // Output: true

        int n2 = 1;
        System.out.println("Is " + n2 + " an ugly number? " + solution.isUgly(n2)); // Output: true

        int n3 = 14;
        System.out.println("Is " + n3 + " an ugly number? " + solution.isUgly(n3)); // Output: false
    }
}