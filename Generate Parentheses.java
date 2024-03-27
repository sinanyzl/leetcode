import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 1;

        List<String> result1 = generateParenthesis(n1);
        List<String> result2 = generateParenthesis(n2);

        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + result1);

        System.out.println("\nInput: n = " + n2);
        System.out.println("Output: " + result2);
    }
}