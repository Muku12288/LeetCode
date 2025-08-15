class Solution {
    public boolean isPowerOfFour(int n) {
        int limit = n/4;
        if(n<= 0){
            return false;
        }else if(n==1){
            return true;
        }
        for(int i=0; i<= 16; i++){
            if(Math.pow(4, i) == n){
                return true;
            }
        }
        return false;
    }
}