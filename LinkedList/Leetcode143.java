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
    public void reorderList(ListNode head) {
        //Step 1 - Find Mid
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        //Step 2 - Reverse the Right Half
        ListNode rightH = mid.next;
        mid.next = null;

        ListNode prev = null;
        ListNode curr = rightH;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        // Merge the List Alternately
        ListNode right = prev;
        ListNode left = head;
        ListNode nextR, nextL;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;


            right = nextR;
            left = nextL;

        }
    }
}