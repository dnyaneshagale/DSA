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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head; // If no need to reverse
        
        ListNode dummy = new ListNode(0); // Create a dummy node to simplify edge cases
        dummy.next = head;
        ListNode prev = dummy; // Node before the `left` position

        // Step 1: Move prev to the node right before `left`
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Reverse from `left` to `right`
        ListNode curr = prev.next; // The current node at `left`
        ListNode next;
        ListNode prevReversed = null;
        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = prevReversed;
            prevReversed = curr;
            curr = next;
        }

        // Step 3: Connect the reversed sublist with the remaining parts
        prev.next.next = curr; // Connect the end of the reversed part to the node after `right`
        prev.next = prevReversed; // Connect the node before `left` to the start of the reversed part

        return dummy.next; // Return the new head
    }
}
