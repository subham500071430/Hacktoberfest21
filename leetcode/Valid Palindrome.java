class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                st.push(s.charAt(i));
            }
        }
        int li=0,ri=st.size()-1;
        while(li<ri){
            if(st.get(li)!=st.get(ri))
                return false;
            li++;
            ri--;
        }
        return true;
    }
}
