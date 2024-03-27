class Solution {
   public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Empty needle is always present at index 0.
        }

        int hayLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }

        return -1; // Needle not found in haystack.
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Index of first occurrence: " + result);
    }
}