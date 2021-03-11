static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        SinglyLinkedListNode prev=null;
        SinglyLinkedListNode ahead=head;
        while(ahead!=null){
            ahead=head.next;
            head.next=prev;
            prev=head;
            if(ahead!=null)
            head=ahead;
        }
        return head;
    }
