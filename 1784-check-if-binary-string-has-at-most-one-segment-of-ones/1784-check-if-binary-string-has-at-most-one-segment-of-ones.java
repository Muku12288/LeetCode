class Solution {
    public boolean checkOnesSegment(String s) {
        int i=0, zc=0, oc=0,sc=0;
        boolean count=false;
        if(s.charAt(0) == '0')return false;
        
        while(i<s.length()){
            if(s.charAt(i) == '1'){
                while(i<s.length() && s.charAt(i) == '1'){
                    i++;
                    oc++;
                }
                sc++;
                i--;
            }
            i++;
        }
       

        return sc == 1?true:false;
    }
}