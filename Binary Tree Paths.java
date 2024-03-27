import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            traverse(root, "", result);
        }
        return result;
    }

    private void traverse(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) {
            // Leaf node, add the path to the result
            result.add(path + node.val);
        }

        if (node.left != null) {
            traverse(node.left, path + node.val + "->", result);
        }

        if (node.right != null) {
            traverse(node.right, path + node.val + "->", result);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        List<String> paths = solution.binaryTreePaths(root);

        // Output the result
        for (String path : paths) {
            System.out.println(path);
        }
    }
}