static boolean findsum(int a[],int n)
{
    boolean b=false;
    int sum=0;
    HashSet<Integer> h=new HashSet<>();
    h.add(0);
    for(int i=0;i<n;i++) {
        	  sum=sum+a[i];
        	  if(h.contains(sum))
        		  b=true;
        	  else
        		  h.add(sum);
          }
    return b;
}
