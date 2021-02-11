class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> n=new Stack<Integer>();
		while(s.empty()!=true){
		   int temp=s.pop();
		   while(!n.empty()&&temp<n.peek()){
		       s.push(n.pop());
		   }
		   n.push(temp);
		}
		return n;
	}
}
