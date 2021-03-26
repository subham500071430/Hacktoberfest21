class GfG {

    Node cur; // Dont change the variable name, its used in main function
    int carry; // Dont change the variable name, its used in main function
    
    //Function to add remaining carry.
    void addCarryToRemaining(Node head, LinkedList res)  { 
        if(head!=cur){
            addCarryToRemaining(head.next,res);
            int sum=carry+head.data;
            carry=sum/10;
            res.push(sum%10);
        }
        return ;
    } 
    
    //Function which adds two linked lists of same size.
	void addSameSize(Node head1, Node head2, LinkedList res) { 
	      if(head1==null)
	      return ;
	      addSameSize(head1.next,head2.next,res);
	      int sum=head1.data+head2.data+carry;
	      carry=sum/10;
	      res.push(sum%10);
    }
} 
