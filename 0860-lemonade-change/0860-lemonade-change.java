class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fc=0, tc=0;

        for(int x:bills){
            if(x==5)fc++;
            else if(x==10){
                if(fc>=1){
                    fc--;
                    tc++;
                }else{
                    return false;
                }  
            }
            else{
                if(tc>=1 && fc>=1){
                    tc--;
                    fc--;
                }
                else if(fc>=3){
                    fc -=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}