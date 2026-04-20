class Solution {
    public int maxDistance(int[] colors) {
        int maxi = Integer.MIN_VALUE, n=colors.length;

     /*   for(int i=0;i<n; i++){
            for(int j=i+1; j<n; j++){
                if(colors[i] != colors[j]){
                    maxi = Math.max(maxi, Math.abs(i-j));
                }
            }
        }*/

        for(int i=0;i<n; i++){
            if(colors[i] != colors[n-1]){
                maxi = Math.max(maxi, n-i-1);
               
            }
            if(colors[i] != colors[0]){
                maxi = Math.max(maxi, i);
            }
        }
        return maxi;
    }
}