import java.util.HashMap;

class Solution {
   public static int romanToInt(String s) {
        // Create a HashMap to store the values of each Roman numeral symbol
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            // If the value of the current symbol is less than the previous symbol, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        String romanNumeral = "XXVII";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }
}