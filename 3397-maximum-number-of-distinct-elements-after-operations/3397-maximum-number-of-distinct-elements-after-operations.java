class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        /*
        List<Integer> arr = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int k2 = -k;
            int num = nums[i];
            while(k2<= k){
                if(!arr.contains(num + k2)){
                    arr.add(num + k2);
                    break;
                }
                k2++;
            }
        }
        return arr.size();
        */
        Arrays.sort(nums);
        int distinct_elements=0, prev= Integer.MIN_VALUE;
        for(int num: nums){
            int cur= Math.min(Math.max(num-k, prev+1), num+k);
            if(cur>prev){
                distinct_elements+=1;
                prev= cur;
            }
        }
        return distinct_elements;
    }
}