class Tree
{
     ArrayList<Integer> a=new ArrayList<Integer>();
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          if(root==null) return a;
          if(k==0){ 
              a.add(root.data);
              return a;
          }
          Kdistance(root.left,k-1);
          Kdistance(root.right,k-1);
          return a;
          
     }
}
