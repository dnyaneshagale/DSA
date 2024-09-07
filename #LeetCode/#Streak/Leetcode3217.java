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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode d = new ListNode(0, head);
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for (ListNode c = d; c.next != null; ) {
            if (set.contains(c.next.val)){
                c.next = c.next.next;
            }else{
                c = c.next;
            }
        }

        return d.next;
    }
}