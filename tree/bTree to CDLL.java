class Solution
{ 
    Node head=null,tail=null,curr=null;
    Node bTreeToClist(Node root)
    {
       if(root==null) return null;
       bTreeToClist(root.left);
       construct(root);
       bTreeToClist(root.right);
       return head;
    }
    public void construct(Node node){
        if(head==null){
            head=new Node(node.data);
            curr=head;
            return ;
        }
       Node ahead=new Node(node.data);
       curr.right=ahead;
       ahead.left=curr;
       curr=ahead;
       ahead.right=head;
       head.left=ahead;
    }
    
}
