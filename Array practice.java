import java.util.Scanner;
public class Main
{   static int temp;
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++){
	     arr[i]=s.nextInt();
	 }
	
	 for(int i=0;i<n;i++){
	     for(int j=0;j<n-i-1;j++){
	         if(arr[j]>arr[j+1]){
	             temp=arr[j+1];
	             arr[j+1]=arr[j];
	             arr[j]=temp;
	         }
	         
	     }
	 }
	 for(int i=0;i<n;i++){
	 System.out.print(arr[i]+" ");}
	 
	}
}
