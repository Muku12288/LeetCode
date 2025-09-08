class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        int a=1;
        while(a< n){
            // if((i%10 != 0) && ((n-i)%10 != 0)){
                int num1 =n-a;
                int num2 =a;
                boolean res = false;
                // For 
                 while((num2%10 )!=0 ){
                    num2 = num2/10;
                    if(num2 == 0){
                        res = true;
                        break;
                    }
                }
                // For num2
                if(res){
                    while((num1%10 )!=0 ){
                        num1 = num1/10;
                        if(num1 == 0){
                            arr[0] = a;
                            arr[1] = n-a;
                            return arr;
                        }
                    }
                }
            // }
            

            a++;
        }
    return arr;
    }
}