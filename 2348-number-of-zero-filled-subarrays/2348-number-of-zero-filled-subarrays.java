class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int len =0;
        long ans = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]== 0){
                while(i< nums.length && nums[i] == 0){
                    len++;
                    ans += len;
                    i++;
                }
                len=0;
            }
        }
        return ans;
    }
}