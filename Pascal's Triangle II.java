import java.util.ArrayList;
import java.util.List;

class Solution {
   public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1); // Add 1 at the beginning of the list
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }

        return row;
    }

    public static void main(String[] args) {
        Solution pascalTriangleRow = new Solution();
        int rowIndex = 4; // Change this to the desired row index
        List<Integer> row = pascalTriangleRow.getRow(rowIndex);
        System.out.println("Row " + rowIndex + " of Pascal's Triangle: " + row);
    }
}