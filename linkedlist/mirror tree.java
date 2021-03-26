class Solution
{
    void mirror(Node node)
    {
	   if(node==null) return ;
	   if(node.left==null&&node.right==null) return ;
	   Node l=node.left;
	   node.left=node.right;
	   node.right=l;
	   mirror(node.left);
	   mirror(node.right);
    }
}
