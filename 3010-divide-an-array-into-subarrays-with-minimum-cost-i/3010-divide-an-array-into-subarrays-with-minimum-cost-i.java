class Solution {
    public int minimumCost(int[] nums) {

        int sum=0;
        // ArrayList<Integer> arr = new ArrayList<>();

        if(nums.length == 3){
            for(int i: nums){
                sum+=i;
            }
        }
        else{
            sum += nums[0];
            // for(int i=1; i<nums.length; i++){
            //     arr.add(nums[i]);
            // }
            // Collections.sort(arr);
            // sum+= (arr.get(0)+arr.get(1));
            nums[0] = 51;
            Arrays.sort(nums);
            sum+=(nums[0]+nums[1]);
        }
        

    return sum;
    }
}