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
    public ListNode insertGreatestCommonDivisors(ListNode h) {
        ListNode c = h;
        while (c != null && c.next != null) {
            int gcdVal = gcd(c.val, c.next.val);
            ListNode newNode = new ListNode(gcdVal);
            newNode.next = c.next;
            c.next = newNode;
            c = c.next.next;
        }
        return h;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}