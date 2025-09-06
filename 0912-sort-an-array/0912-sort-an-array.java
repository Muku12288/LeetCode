class Solution {
    //1. merge sort
    void mergeSort(int low, int high, int[] nums){
        if(low == high){
            return;
        }
        int mid = (low+high)/2;

        mergeSort(low, mid, nums);
        mergeSort(mid+1, high, nums);
        merge(low, mid, high, nums);
    }
    //2. merge
    void merge(int low, int mid, int high, int[] nums) {
        int left = low, right = mid+1, i=0;
        int[] temp = new int[nums.length];

        while(left<= mid && right<= high){
            if(nums[left] <= nums[right]){
                temp[i] = nums[left];
                i++;
                left++;
                
            }else{
                temp[i] = nums[right];
                i++;
                right++;
            }
        }
        while(left<= mid){
            temp[i] = nums[left];
            i++;
            left++;
        }
        while(right<=high){
            temp[i] = nums[right];
            i++;
            right++;
        }

        for(int j=low; j<= high; j++){
            nums[j] = temp[j-low];
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(0, nums.length-1, nums);

        return nums;
    }
}