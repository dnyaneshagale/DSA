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
class Solution {
    // Function to perform postorder traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    // Helper function to perform recursion
    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse left subtree
        postorderHelper(node.left, result);
        // Traverse right subtree
        postorderHelper(node.right, result);
        // Visit root node
        result.add(node.val);
    }
}