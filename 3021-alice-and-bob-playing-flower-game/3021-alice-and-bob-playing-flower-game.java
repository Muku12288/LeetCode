class Solution {
    public long flowerGame(int n, int m) {
        long evenx =0, oddx =0,eveny =0, oddy =0;;

        //x is odd
        if(n%2!=0){
            oddx = (n+1)/2;
            evenx = n-oddx;
        }else{   //x is even
            oddx = n/2;
            evenx = n-oddx;
        }
    
        // For y
        // if y=odd
        if(m%2!=0){
            oddy = (m+1)/2;
            eveny = m-oddy;
        }else{   //y is even
            oddy = m/2;
            eveny = m-oddy;
        }
        long ans = (evenx*oddy) +(eveny*oddx);
        return ans;
    }
}