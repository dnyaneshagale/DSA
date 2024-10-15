/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode tempLeft = headA;
        ListNode tempRight = headB;

        while (tempLeft != tempRight) {
            tempLeft = (tempLeft == null) ? headB : tempLeft.next;
            tempRight = (tempRight == null) ? headA : tempRight.next;
        }

        return tempLeft; // Either they meet at intersection or both are null
    }
}