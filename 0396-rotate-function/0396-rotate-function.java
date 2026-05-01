class Solution {
    /*
    --------------------- THIS SOLUTION IS O(N2)---------------TLE--------
    public int findVal(int[] nums, int j){
        int n = nums.length, i=0, sum=0;
        while(i<n){
            sum+= nums[j%n]*i;
            j++;
            i++;
        }
        System.out.println(sum);
        return sum;
    }
    public int maxRotateFunction(int[] nums) {
        int maxi= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int j = nums.length -i;
            maxi = Math.max(maxi,findVal(nums, j));
        }
    return maxi;
    */
    public int maxRotateFunction(int[] nums) {
        int sum=0, n= nums.length, F=0;
        
        for(int i=0; i<n; i++){
            sum+= nums[i];
            F += i*nums[i];
        }
        int maxi=F;

        for(int k=1;k<n; k++){
            F = F + sum-n*nums[n-k];
            maxi = Math.max(maxi, F);
        }
        return maxi;
    }
}