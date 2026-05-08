class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fc=0, tc=0;
        // Arrays.sort(bills);

        for(int i=0;i<bills.length; i++){
            if(bills[i]==5)fc++;
            if(bills[i]==10){
                if(fc>=1){
                    fc--;
                    tc++;
                }else{
                    return false;
                }  
            }
            if(bills[i]==20){
                if(fc<=0)return false;
                else if(tc<=0 && fc<3)return false;
                else if(tc>=1 && fc>=1){
                    tc--;
                    fc--;
                    // 2c++;
                }
                else if(tc<=0 && fc>=3){
                    fc -=3;
                    // 2c++;
                }
            }
        }
        return true;
    }
}