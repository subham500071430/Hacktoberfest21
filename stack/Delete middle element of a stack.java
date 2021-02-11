class Solution{
    public void deleteMid(Stack<Integer>s,int n){
        Stack<Integer> s1=new Stack<Integer>();
        int i=n/2;
        while(i-->0){
           s1.push(s.pop()); 
        }
        s.pop();
        while(s1.empty()!=true)
        s.push(s1.pop());
    } 
}
