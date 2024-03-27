class Solution {
   public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        // Binary search approach
        int left = 0, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                left = mid + 1;
                result = mid;  // Store the potential result
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int result = mySqrt(8);
        System.out.println(result);  // Output: 2
    }
}