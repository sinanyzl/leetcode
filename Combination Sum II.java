import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to handle duplicates
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates to avoid duplicate combinations
            }

            if (candidates[i] > remaining) {
                break; // Optimization: candidates are sorted, no need to check further
            }

            currentList.add(candidates[i]);
            backtrack(result, currentList, candidates, remaining - candidates[i], i + 1);
            currentList.remove(currentList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution combinationSum = new Solution();

        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;
        List<List<Integer>> result1 = combinationSum.combinationSum2(candidates1, target1);
        System.out.println(result1);

        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;
        List<List<Integer>> result2 = combinationSum.combinationSum2(candidates2, target2);
        System.out.println(result2);
    }
}