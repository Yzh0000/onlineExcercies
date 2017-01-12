/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int m, int n) {
        if(n<=m)    return head;
        ListNode* dummyHead=new ListNode(0);
        dummyHead->next=head;
        
        ListNode* preM = dummyHead;
        for(int i=0;i<m-1;i++)  preM=preM->next;
        
        ListNode* p1=preM->next;
        ListNode* p2=p1->next;
 
        for(int i=0;i<n-m;i++){
            ListNode* tmp=p2->next;
            p2->next=p1;
            p1=p2;
            p2=tmp;
        }
        
        preM->next->next=p2;
        preM->next=p1;
        
        return dummyHead->next;
    }
};