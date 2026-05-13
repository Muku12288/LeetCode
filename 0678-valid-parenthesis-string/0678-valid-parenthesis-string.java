class Solution {
    /* BRUTE FORCE O(3^N)
    boolean func(String s, int ind, int cnt){
        if(cnt<0){
            return false;
        }
        else if(ind == s.length()){
            return (cnt==0);
        }
        else if(s.charAt(ind) == '('){
           return func(s,ind+1, cnt+1);
        }
        else if(s.charAt(ind) == ')'){
           return func(s,ind+1, cnt-1);
        }
        
    return func(s,ind+1, cnt+1) ||func(s,ind+1, cnt-1)||func(s,ind+1, cnt);
    }*/
    public boolean checkValidString(String s) {
        
        //return func(s,0, 0);

        int max=0, min=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                min--;
                max--;
            }
            else if(s.charAt(i) == '*'){
                min--;
                max++;
            }
            else if(s.charAt(i) == '('){
                min++;
                max++;
            }

            if(max < 0)return false;
            if(min <0)min=0;

        }
        return min==0;
    }
}