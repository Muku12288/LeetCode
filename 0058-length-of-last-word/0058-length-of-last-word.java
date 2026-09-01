class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int i=len-1, c=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
                while(i>=0  && s.charAt(i)!=' '){
                    i--;
                    c++;
                }
                break;
            }
            i--;
        }
    return c;
    }
}