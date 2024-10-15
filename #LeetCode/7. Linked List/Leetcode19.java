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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        // if(size == 1){
        //     head = null;
        //     return head;
        // }

        // if(size == 0){
        //     return new ListNode();
        // }

        if(size == n){
            head = head.next;
            return head;
        }

        int targetIdx = size - n;
        int i = 0;
        ListNode prevNode = head;
        while(i < targetIdx-1){
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;

        return head;
    }
}