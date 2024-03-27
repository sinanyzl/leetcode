import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) {
            return result;
        }

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
       

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            // First element of the row is always 1
            currentRow.add(1);

            // Calculate the middle elements
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of the row is always 1
            currentRow.add(1);

            result.add(currentRow);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascalsTriangle = generate(numRows);

        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : pascalsTriangle) {
            System.out.println(row);
        }
    }
}