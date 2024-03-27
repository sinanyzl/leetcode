class Solution {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1 and nums2
        int p1 = m - 1, p2 = n - 1;
        int p = m + n - 1;  // pointer for the merged array

        // Merge from the end of the arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: 1 2 2 3 5 6
    }
}