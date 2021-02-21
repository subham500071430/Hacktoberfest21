public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int j=A.size()-1;
        int li=0;
        while(li<A.size()&&A.get(li)==0){
            li++;
        }
        while(A.get(j)==9){
            j--;
            if(j<li)
            break;
        }
        if(j<li){
            arr.add(1);
            for(int i=li;i<A.size();i++){
                arr.add(0);
            }
        }
        else{
            for(int i=li;i<A.size();i++){
                if(i==j)
                arr.add(A.get(i)+1);
                else if(i>j)
                arr.add(0);
                else
                arr.add(A.get(i));
            }
        }
        return arr;
    }
}
