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
    static class Info {
        int diameter;
        int height;
        
        Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Info ans = diameterOfABinaryTree(root);
        return ans.diameter;
    }

    public Info diameterOfABinaryTree(TreeNode root) {
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameterOfABinaryTree(root.left);
        Info rightInfo = diameterOfABinaryTree(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height);
        int height = Math.max(leftInfo.height, rightInfo.height)+1;

        return new Info(diameter, height);
    }
}