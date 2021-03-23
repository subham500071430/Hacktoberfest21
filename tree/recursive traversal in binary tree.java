// PreOrder Traversal
 static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        print(a,root);
        return a;
       
    }
    static void print(ArrayList<Integer> a,Node root){
        if(root==null){
            return ;
        }
        a.add(root.data);
        print(a,root.left);
        print(a,root.right);
    }

//InOrder Traversal
ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        print(a,root);
        return a;
    }
    static void print(ArrayList<Integer> a,Node root){
        if(root==null){
            return ;
        }
        print(a,root.left);
        a.add(root.data);
        print(a,root.right);
    }
//PostOrder Traversal 
ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> a=new ArrayList<Integer>();
       print(a,root);
       return a;
    }
    static void print(ArrayList<Integer> a,Node root){
       if(root==null){
         return ;
       }
       print(a,root.left);
       print(a,root.right);
       a.add(root.data);
    }
