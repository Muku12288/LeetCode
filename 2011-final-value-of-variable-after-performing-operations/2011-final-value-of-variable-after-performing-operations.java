class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int negative=0, positive =0;

        for(String s : operations){
            if(s.charAt(0) == '-' || s.charAt(1) == '-')negative++;
            else if(s.charAt(0) == '+' || s.charAt(1) == '+')positive++;
            
        }
        return positive-negative;
    }
}