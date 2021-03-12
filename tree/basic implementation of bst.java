//To find the size of BST
public static int size(Node node) {
    if(node==null){
        return 0;
    }
    int sizeofleft=size(node.left);
    int sizeofright=size(node.right);
    return sizeofleft+sizeofright+1;
  }
//To find sum of all nodes of BST
  public static int sum(Node node) {
    if(node==null){
        return 0;
    }
    int sumofleft=sum(node.left);
    int sumofright=sum(node.right);
    return node.data+sumofleft+sumofright;
  }
//To find the maximum of BST
  public static int max(Node node) {
    Node curr=node;  
    while(curr.right!=null){
        curr=curr.right;
    }
    return curr.data;
  }
//To find the minimum of BST
  public static int min(Node node) {
    Node curr1=node;  
    while(curr1.left!=null){
        curr1=curr1.left;
    }
    return curr1.data;
  }
//To find the node in BST
  public static boolean find(Node node, int data){
    if(node==null){
        return false;
    }
    if(data==node.data){
        return true;
    }
    if(data>node.data){
       return find(node.right,data);
    }
    else{
       return find(node.left,data);    
    }
  }  
