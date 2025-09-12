class Solution {
    public boolean doesAliceWin(String s) {
        int vcount=0, ccount=0;

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                vcount++;
            }else{
                ccount++;
            }
        }

        
        if(vcount%2 != 0){
            return true;
        }else if(vcount == 0){
            return false;
        }else if(vcount%2 == 0){
            return true;
        }

    return false;
    }
}