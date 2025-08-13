class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        

        permutation(nums, 0, list);
        return list;
    }

    void permutation(int[] nums, int index, List<List<Integer>> list){
        Set<Integer> set = new HashSet<>();
        if(index == nums.length){
            List<Integer> arr = new ArrayList<>();
            for(int val: nums)arr.add(val);
            list.add(arr);
            return;
        }
        for(int i=index; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                swap(nums, index, i);
                permutation(nums, index+1, list);
                swap(nums, index, i);
            }
            
        }
        // permutation(nums, index+1, list);
    }

    void swap(int[] nums,int index,int i){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}