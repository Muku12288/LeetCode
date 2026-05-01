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
        // Step 1: Calculate the sum of all elements and the initial F(0)
        for(int i=0; i<n; i++){
            sum+= nums[i];
            F += i*nums[i];
        }
        int maxi=F;
        // Step 2: Calculate F(1) to F(n-1) using the recurrence relation
       // Apply formula: F(k) = F(k-1) + sum - n * last_element_of_prev_rotation
       // or F(k+1)=F(k)+sum-n*arr[n-k];
        for(int k=1;k<n; k++){
            F = F + sum-n*nums[n-k];
            // Update max if F is larger
            if(maxi<F)maxi = F;
        
        }
        return maxi;
    }
}