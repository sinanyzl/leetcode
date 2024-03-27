class Solution {
  public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 58;
        int num3 = 1994;

        System.out.println(intToRoman(num1));  // Output: "III"
        System.out.println(intToRoman(num2));  // Output: "LVIII"
        System.out.println(intToRoman(num3));  // Output: "MCMXCIV"
    }
}