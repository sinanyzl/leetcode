class Solution {
  public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // Not found, should not reach here as per constraints
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(numbers1, target1);
        System.out.println("Output for Test Case 1: [" + result1[0] + ", " + result1[1] + "]");
        
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(numbers2, target2);
        System.out.println("Output for Test Case 2: [" + result2[0] + ", " + result2[1] + "]");
        
        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] result3 = solution.twoSum(numbers3, target3);
        System.out.println("Output for Test Case 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}