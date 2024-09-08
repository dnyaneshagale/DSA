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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
        
        int size = len / k;
        int extra = len % k;
        ListNode[] result = new ListNode[k];
        node = head;
        
        for (int i = 0; i < k; i++) {
            ListNode partHead = node;
            int currentSize = size + (extra-- > 0 ? 1 : 0);
            
            for (int j = 1; j < currentSize && node != null; j++) {
                node = node.next;
            }
            
            if (node != null) {
                ListNode next = node.next;
                node.next = null;
                node = next;
            }
            
            result[i] = partHead;
        }
        
        return result;
    }
}