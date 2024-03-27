import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
   public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        boolean[] used = new boolean[nums.length];
        generatePermutations(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void generatePermutations(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue; // Skip duplicates and already used elements
            }

            used[i] = true;
            current.add(nums[i]);

            generatePermutations(nums, current, used, result);

            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution permutations = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 2};
        List<List<Integer>> result1 = permutations.permuteUnique(nums1);
        System.out.println(result1);

        // Example 2
        int[] nums2 = {1, 2, 3};
        List<List<Integer>> result2 = permutations.permuteUnique(nums2);
        System.out.println(result2);
    }
}