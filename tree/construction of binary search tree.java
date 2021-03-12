package coding;
import java.util.*;
import java.io.*;
import java.lang.*;

class solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter elements of binary search tree");
	    int[] a=new int[7];
	    for(int i=0;i<a.length;i++) {
	    	a[i]=Integer.parseInt(br.readLine());
	    }
	    Arrays.sort(a);
	    Node root=constructor(a,0,a.length-1);
	    display(root);
	}
	static Node constructor(int[] arr,int low,int high) {
		if(low>high) {
			return null;
		}
		int mid=(high+low)/2;
		int data=arr[mid];
		Node left=constructor(arr,low,mid-1);
		Node right=constructor(arr,mid+1,high);
		Node node=new Node(data,left,right);
		return node;
	}
	static void display(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		display(root.left);
		display(root.right);
	}
}
