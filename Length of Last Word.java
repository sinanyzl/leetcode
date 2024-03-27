class Solution {
  public int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        int length = 0;
        int i = s.length() - 1;

        // Find the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        // Example 1
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5

        // Example 2
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4

        // Example 3
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}