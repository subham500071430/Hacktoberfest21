class TripletSum
{
    public static int find3Numbers(int arr[], int N, int X) { 
    
      Arrays.sort(arr);
      for(int i=0;i<N;i++){ 
      int li=0,ri=N-1;      
      while(li<ri&&i!=li&&i!=ri){
          if(arr[i]+arr[li]+arr[ri]==X)
          return 1;
          if(arr[i]+arr[li]+arr[ri]<X)
          li++;
          if(arr[i]+arr[li]+arr[ri]>X)
          ri--;
      }
      }
      return 0;
    }
}
