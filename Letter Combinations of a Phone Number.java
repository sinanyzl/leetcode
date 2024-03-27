import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        Map<Character, String> digitMap = new HashMap<>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        generateCombinations(digits, 0, new StringBuilder(), result, digitMap);
        return result;
    }

    private static void generateCombinations(String digits, int index, StringBuilder current, List<String> result, Map<Character, String> digitMap) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = digitMap.get(digit);

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            generateCombinations(digits, index + 1, current, result, digitMap);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(letterCombinations("23")); // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(letterCombinations(""));  // Output: []
        System.out.println(letterCombinations("2"));  // Output: ["a","b","c"]
    }
}