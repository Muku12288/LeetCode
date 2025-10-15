class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int i=0, j=1, prev=0, window2=0, res=0;

        while(i< nums.size()){
            int start =i;

            while(i+1< nums.size() && nums.get(i)<nums.get(i+1)){
                i++;
            }
            int curr = i-start+1;
            res = Math.max(res, Math.max(curr>>1, Math.min(curr,prev)));

            prev = curr;
            i++;
        }
        return res;
    }
}