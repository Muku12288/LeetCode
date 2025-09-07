class Solution {
    public int[] sumZero(int n) {
        int len=0, count=1;
        int[] arr = new int[n];

        if(n==1){
            arr[0]=0;
            return arr;
        }
        if(n%2 !=0){
            // len = (n+1)/2;
            len= n-1;
            arr[n-1] = 0;
        }
        else{
            //  len=n/2;
            len = n;
        }

        for(int i=0; i<len;i+=2){
            arr[i] = count;
            arr[i+1] = -count;
            count++;
        }
        return arr;
    }
}