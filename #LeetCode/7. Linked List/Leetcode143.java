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
        // Step 1 : Find the Middle Node

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        // Step 2 : Reverse the Second Half of the List

        ListNode prev = null;
        ListNode curr = mid.next;
        mid.next = null;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        //Step 3 : Merge Them as Expected.
        ListNode rightH = prev; //rightH -> Right Head (new Head After Reverse)
        ListNode leftH = head; // leftH -> Left Head
        ListNode nextRight, nextLeft;

        while(rightH != null && leftH != null){

            nextLeft = leftH.next;
            leftH.next = rightH;
            
            nextRight = rightH.next;
            rightH.next = nextLeft;
            
            rightH = nextRight;
            leftH = nextLeft;
        }
    }
}