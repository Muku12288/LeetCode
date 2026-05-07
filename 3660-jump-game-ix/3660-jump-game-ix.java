class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;

        int[] leftMax = new int[n];
        int[] rightSmall = new int[n];

        leftMax[0] = nums[0];
        rightSmall[n-1]= nums[n-1];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(nums[i], leftMax[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            rightSmall[i] = Math.min(nums[i], rightSmall[i+1]);
        }

        int[] ans = new int[n];
        ans[n-1] = leftMax[n-1];
        for(int i=n-2; i>=0; i--){
            if(leftMax[i]<=rightSmall[i+1]){
                ans[i] = leftMax[i];
            }else{
                ans[i] = ans[i+1];
            }
        }
    return ans;
    }
}