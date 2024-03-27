class Solution {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String prevResult = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        char currentDigit = prevResult.charAt(0);

        for (int i = 1; i < prevResult.length(); i++) {
            if (prevResult.charAt(i) == currentDigit) {
                count++;
            } else {
                result.append(count).append(currentDigit);
                count = 1;
                currentDigit = prevResult.charAt(i);
            }
        }

        result.append(count).append(currentDigit);
        return result.toString();
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 4;

        System.out.println("Output for n = " + n1 + ": " + countAndSay(n1));
        System.out.println("Output for n = " + n2 + ": " + countAndSay(n2));
    }
}