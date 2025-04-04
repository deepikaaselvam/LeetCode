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
    public  int traverseAllandCnt(ListNode head)
    {
        ListNode curr = head;
        int cnt =0;
        while(curr!=null)
        {
            cnt++;
            curr =curr.next;
        }
        return cnt;
    }
     public static ListNode moveTwopointer(ListNode head,int value,int total)
    {
        if(total ==1)
        {
            return null;
        }
        if(value ==1)
        {
            return head.next;
        }
        ListNode curr = head;
        int cnt=1;
        for(int check =cnt;check<value-1;check+=1)
        {
            curr=curr.next;
            cnt++;
        }
        curr.next = curr.next.next;
        return head;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
         int total =traverseAllandCnt(head);
         int value =(total - n)+1;
        return moveTwopointer(head,value,total);
        
    }
}
/*
 ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        if(fast==null)
        {
            return head.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode del=slow.next;
        slow.next=slow.next.next;
        // del=null;
        return head;
        */