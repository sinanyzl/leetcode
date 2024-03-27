class Solution {
     public static void main(String[] args) {
        int x = 121; // Replace with your integer

        boolean isPalindrome = isPalindrome(x);

        System.out.println("Is the number " + x + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}