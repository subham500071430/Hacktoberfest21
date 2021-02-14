class Compute {
    
    public void rotate(long arr[], long n)
    {   
        int li=0,ri=(int)n-2;
        while(li<ri){
            long temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }
        li=0;
        ri=(int)n-1;
        while(li<ri){
            long temp1=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp1;
            li++;
            ri--;
        }
    }
}
