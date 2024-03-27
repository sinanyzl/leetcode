import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
   public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to handle duplicates efficiently
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remaining) {
                break; // Stop if the candidate is greater than remaining
            }

            current.add(candidates[i]);
            backtrack(result, current, candidates, remaining - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;

        int[] candidates2 = {2, 4, 8};
        int target2 = 8;

        List<List<Integer>> result1 = combinationSum(candidates1, target1);
        List<List<Integer>> result2 = combinationSum(candidates2, target2);

        System.out.println("Input: candidates = " + Arrays.toString(candidates1) + ", target = " + target1);
        System.out.println("Output: " + result1);

        System.out.println("\nInput: candidates = " + Arrays.toString(candidates2) + ", target = " + target2);
        System.out.println("Output: " + result2);
    }
}