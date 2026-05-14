class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int max = nums[nums.length -1];
        if(nums.length != max+1)return false;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=i)return false;
            if(i==nums.length-2)return nums[i]==nums[i+1];
        }
    return true;
    }
}