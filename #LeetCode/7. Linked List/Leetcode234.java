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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        //Step 1 -> Find "Mid"
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        //Step 2 -> Reverse right half
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Step 3 -> Check if Right Half == Left Half
        ListNode right = prev;
        ListNode left = head;

        while(right != null){
            if(right.val != left.val){
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }
}