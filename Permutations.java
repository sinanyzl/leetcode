import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        generatePermutations(nums, used, current, result);

        return result;
    }

    private static void generatePermutations(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                generatePermutations(nums, used, current, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {0, 1};
        int[] nums3 = {1};

        System.out.println(permute(nums1));
        System.out.println(permute(nums2));
        System.out.println(permute(nums3));
    }
}