class Solution {
    public int findMin(int[] nums) {
        int low= 0;
        int high = nums.length -1;
        int mid;
        int mini = nums[0];
        while(low <= high){
            mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                mini= Math.min(nums[low], mini);
                low = mid+1;
            }
            else
            {
                mini= Math.min(nums[mid], mini);
                high = mid-1;
            }
        }
    return mini;
    }
}