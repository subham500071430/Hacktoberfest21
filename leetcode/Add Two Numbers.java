class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry=0;
        ListNode prev=null,head=null;
        
        if(l1==null&&l2==null) return null;
        else if(l1==null) return l2;
        else if(l2==null) return l1;
        
        while(l1!=null||l2!=null){
            if(head==null){
                ListNode n = new ListNode((l1.val+l2.val)%10);
                carry = (l1.val+l2.val)/10;
                prev=n;
                head=prev;
            }
            else{
            if(l1==null){
                ListNode n = new ListNode((l2.val+carry)%10);
                carry = (l2.val+carry)/10;
                prev.next = n;
                prev = prev.next;
            }
            if(l2==null){
                ListNode n = new ListNode((l1.val+carry)%10);
                carry = (l1.val+carry)/10;
                prev.next = n;
                prev = prev.next;
            }
            if(l1!=null&&l2!=null){
                ListNode n = new ListNode((l1.val+l2.val+carry)%10);
                carry = (l1.val+l2.val+carry)/10;
                prev.next = n;
                prev = prev.next; 
            }
            }
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
        }
        if(carry!=0){
         ListNode n = new ListNode(carry); 
         prev.next=n;
        }
        return head;
        }

}
