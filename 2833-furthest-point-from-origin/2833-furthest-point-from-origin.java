class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lc=0, rc=0, uc=0;

        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='L'){
                lc++;
            }else if(moves.charAt(i)=='R'){
                rc++;
            }else{
                uc++;
            }
        }

        return (lc+uc-rc)>= (rc+uc-lc)?(lc+uc-rc):(rc+uc-lc);
    }
}