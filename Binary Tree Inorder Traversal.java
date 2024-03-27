/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}


class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        return result;
    }

    private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderTraversalHelper(node.left, result);
            result.add(node.val);
            inorderTraversalHelper(node.right, result);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Solution traversal = new Solution();

        // Constructing a sample binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Performing inorder traversal
        List<Integer> result = traversal.inorderTraversal(root);

        // Displaying the result
        System.out.println("Inorder Traversal: " + result);
    }
}