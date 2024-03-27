class Solution {
   public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Found a mismatched bracket
            }
        }

        return stack.isEmpty(); // Stack should be empty if all brackets are matched
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        boolean result = isValid(input);
        System.out.println("Is the string valid? " + result);
    }
}