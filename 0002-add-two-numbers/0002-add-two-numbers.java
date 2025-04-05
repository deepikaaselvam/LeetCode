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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nxtVal=0;
        ListNode node = new ListNode(-1);
        ListNode current = node;
        while(l1!=null && l2!=null)
        {
             int answer =(l1.val+l2.val+nxtVal);
             int carry = answer%10;
             current.next = new ListNode(carry);
             current = current.next;
             nxtVal = answer / 10;
             l1=l1.next;
             l2=l2.next;

        }
        while(l1!=null)
        {
            int answer=(l1.val+nxtVal);
            int carry =answer%10;
            current.next = new ListNode(carry);
            current =current.next;
            nxtVal = answer / 10;
            l1=l1.next;

        }
        while(l2!=null)
        {
            int answer =(l2.val+nxtVal);
              int carry =answer%10;
            current.next = new ListNode(carry);
            current =current.next;
            nxtVal = answer / 10;
            l2=l2.next;

        }
        if(nxtVal!=0)
        {
             current.next =new ListNode(nxtVal);
        }
       
        return node.next;
       
        
    }
}