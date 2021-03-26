class Solution
{   
    Node newhead;
    Node first;
    boolean flag=true;
    public Node addOne(Node head) 
    { 
        newhead=null;
        first=head;
        add(head);
        if(newhead!=null)
        return newhead;
        else
        return head;
    }
    public void add(Node node){
        if(node==null) return ;
        add(node.next);
        if(flag==true&&node==first){
          if(node.data+1>9){
             node.data=0;
             newhead=new Node(1);
             newhead.next=node;
          }
          else{
             node.data+=1; 
          }
        }
        else if(flag==true){
          if(node.data+1>9){
             node.data=0;
          }
          else{
             node.data+=1;
             flag=false; 
          }  
        }
    }
}
