class Solution {
       public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, current, low);
                current++;
                low++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution sorter = new Solution();

        // Example 1
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sorter.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {2, 0, 1};
        sorter.sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}