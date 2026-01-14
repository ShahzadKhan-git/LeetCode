class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode current = head;
     ListNode prev = null;
     ListNode agla = null;

       while(current!= null) {
        agla = current.next;
        current.next = prev;
        prev = current;
        current = agla;
       }
       return prev;
    }
}