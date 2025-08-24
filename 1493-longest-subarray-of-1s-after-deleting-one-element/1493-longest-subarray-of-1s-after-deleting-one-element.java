class Solution {
    public int longestSubarray(int[] nums) {
        int count=0, len=0, maxlen =0, j=0;
        for(int i=0; i<nums.length; i++){
           count =0;
           len =0;
           j=i;
           while(count<=1 && j<nums.length){
                if(nums[j] == 0){
                    count++;
                }else{
                    len++;
                    maxlen = Math.max(maxlen, len);
                }
                j++;
           }
        }
        return maxlen == nums.length? maxlen-1:maxlen;
    }
}