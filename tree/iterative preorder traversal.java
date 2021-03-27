class Tree
{
    ArrayList<Integer> a=new ArrayList<Integer>();
    Stack<Node> s=new Stack<Node>();
    ArrayList<Integer> preOrder(Node root)
    {
        s.push(root);
        while(!s.isEmpty()){
            a.add(s.peek().data);
            Node n=s.pop();
            if(n.right!=null){
                s.push(n.right);
            }
            if(n.left!=null){
                s.push(n.left);
            }
        }
        return a;
    }
