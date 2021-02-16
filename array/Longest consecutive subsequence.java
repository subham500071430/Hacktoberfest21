//Approach 1
class Subseq
{   
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   int count=1,maxcount=1;
	   Arrays.sort(arr);
	   for(int i=0;i<N-1;i++){
	       if(arr[i]+1!=arr[i+1]&&arr[i]!=arr[i+1]){
	           count=1;
	       }
	       if(arr[i]+1==arr[i+1]){
	           count++;
	       }
	       if(maxcount<count)
	       maxcount=count;
	   }
	   return maxcount;
	}
}

//Approach 2

class Subseq
{   
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   
	   HashSet<Integer> h=new HashSet<Integer>();
	   int x=Integer.MIN_VALUE;
	   for(int i=0;i<N;i++)
	   h.add(arr[i]);
	   for(int i=0;i<N;i++){
	       if(!h.contains(arr[i]-1)){
	           int temp=arr[i];
	           while(h.contains(temp)){
	               temp++;
	           }
	           if(x<temp-arr[i])
	           x=temp-arr[i];
	       }
	   }
	   return x;
	}
}
