class Solution {
    public int lengthOfLastWord(String s) {
        String m=s.trim();
        int len=0;
        for(int i=m.length()-1;i>=0;i--){
           if(m.charAt(i)==' ')
               break;
           len++; 
        }
        return len;
    }
}
