class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            
            // If the current digit becomes 10, set it to 0 and carry 1
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If the current digit is less than 10, no need to carry, return the result
                return digits;
            }
        }
        
        // If we reach here, it means we have a carry at the most significant digit
        // Create a new array with one additional digit and set the most significant digit to 1
        int[] result = new int[n + 1];
        result[0] = 1;
        
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9}; // Example input: [9, 9, 9]
        int[] result = plusOne(digits);
        
        System.out.print("Result after increment: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}