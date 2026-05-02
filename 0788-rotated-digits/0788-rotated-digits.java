class Solution {
    public boolean isValid(int num){
        int n=num;
        boolean isValid= true;
        boolean hasChange=false;
        
        while(n>0){
            int digit = n%10;
            if(digit==2||digit==5||digit==6||digit==9){
                hasChange=true;
            }
            else if(digit == 3 || digit == 4 ||digit == 7){
                isValid = false;
                break;
            }
            n = n/10;
        }
        
       return (isValid && hasChange); 
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1; i<=n;i++){
            boolean check = isValid(i);
            if(check)count++;
        }
       return count; 
    }
}