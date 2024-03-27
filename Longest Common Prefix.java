class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference prefix
        String prefix = strs[0];

        // Iterate through the array of strings
        for (int i = 1; i < strs.length; i++) {
            // Compare each character of the reference prefix with the corresponding character in the current string
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Update the prefix to the common prefix found so far
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, no common prefix exists, break the loop
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Example usage
        String[] strings = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strings);
        System.out.println("The longest common prefix is: " + result);
    }
}