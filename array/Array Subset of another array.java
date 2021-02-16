class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    HashSet<Integer> h=new HashSet<Integer>();
		    String[] s=br.readLine().split(" ");
		    int m=Integer.parseInt(s[0]);
		    int n=Integer.parseInt(s[1]);
		    String[] s1=br.readLine().split(" ");
		    String[] s2=br.readLine().split(" ");
		    int[] b=new int[n]; 
		    for(int i=0;i<m;i++){
		        h.add(Integer.parseInt(s1[i]));
		    }
		    boolean c=true;
		    for(int i=0;i<n;i++){
		        b[i]=Integer.parseInt(s2[i]);
		        if(!h.contains(b[i])){
		           c=false; 
		           break; 
		        }
		    }
		
		    if(c==true)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
