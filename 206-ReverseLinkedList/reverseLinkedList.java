/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        /* 1st version: Memory Limit Exceeded. Why?
        
        if (head == null) return null;
        
        //currentNode, nextNode
        ListNode currNode = head;
        ListNode nextNode = head.next;
        while (nextNode != null) {
        //change direction and move currNode, nextNode;
        ListNode tempNode = nextNode.next;
        nextNode.next = currNode;
        currNode = nextNode;
        nextNode = tempNode;
        }
        
        return currNode;
        */
        
        /*
        // 2nd version:
        if (head == null || head .next == null) return head;
        
        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        
        return newHead;
        */
        
        //3rd version:
        // if (head == null) return null;
        
        ListNode currNode = null;
        ListNode nextNode = head;
        
        while (nextNode != null) {
            ListNode tempNode = nextNode.next;
            nextNode.next = currNode;
            currNode = nextNode;
            nextNode = tempNode;
        }
        
        return currNode;
    
        
    }
}