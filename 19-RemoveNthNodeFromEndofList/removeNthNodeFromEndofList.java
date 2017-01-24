/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(1);
        temp.next = head;
        ListNode near = temp;
        ListNode far = temp;
        //define near and far with distance n+1. In other words, when far -> null (after end), near -> (n+1)-th node from end.
        for (int i = 0; i< n+1; i++){
            far = far.next;
        }
        while(far != null) {
            near = near.next;
            far = far.next;
        }
        near.next = near.next.next;
        return temp.next;
}
}