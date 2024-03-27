class Solution {
  public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // variable to track the unique elements and the position to place the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] expectedNums = {1, 2, 3, 4, 5};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}