import java.util.HashMap;

class Solution {
   public static int[] twoSum(int[] nums, int target) {
        // Map to store the complement of each element along with its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{complementMap.get(complement), i};
            }

            // If complement is not found, add the current number and its index to the map
            complementMap.put(nums[i], i);
        }

        // No solution found, return an empty array or handle it as needed
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}