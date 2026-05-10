class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, i=0, max=0;
        if(n == 1)return true;
        
        while(i<=max && i<n){
            max = Math.max(max, i+nums[i]);
            i++;
        }

    return max>=n-1?true:false;
    }
}