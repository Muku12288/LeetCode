class Solution {
    public int minOperations(String s) {
        int cp1=0,cp2=0, p1=1, p2=0;
        

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=(char)(p1+'0')){
                cp1++;
            }else if(s.charAt(i)!=(char)(p2+'0')){
                cp2++;
            }
            int tmp = p1;
            p1=p2;
            p2=tmp;
        }
        return Math.min(cp1, cp2);
    }
}