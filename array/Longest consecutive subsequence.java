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
