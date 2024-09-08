/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode h, TreeNode r) {
        if (r == null) return false;
        return dfs(h, r) || isSubPath(h, r.left) || isSubPath(h, r.right);
    }

    private boolean dfs(ListNode h, TreeNode r) {
        if (h == null) return true;
        if (r == null || h.val != r.val) return false;
        return dfs(h.next, r.left) || dfs(h.next, r.right);
    }
}