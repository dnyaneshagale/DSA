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
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode h) {
        int[][] a = new int[m][n];
        for (int[] r : a) Arrays.fill(r, -1);
        int t = 0, b = m - 1, l = 0, r = n - 1;
        while (t <= b && l <= r && h != null) {
            for (int i = l; i <= r && h != null; i++) {
                a[t][i] = h.val;
                h = h.next;
            }
            t++;
            for (int i = t; i <= b && h != null; i++) {
                a[i][r] = h.val;
                h = h.next;
            }
            r--;
            for (int i = r; i >= l && h != null; i--) {
                a[b][i] = h.val;
                h = h.next;
            }
            b--;
            for (int i = b; i >= t && h != null; i--) {
                a[i][l] = h.val;
                h = h.next;
            }
            l++;
        }
        return a;
    }
}
