class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode i=head;
        ListNode j=head;
        int currval=i.val;
        while(i!=null){
            if(i.val!=currval&&j.next!=null){
               j.next.val=i.val;
               j=j.next;
               currval=i.val;
            }
            i=i.next;
       } 
       j.next=null;
        return head;
    }
}
