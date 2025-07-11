class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);
        
        for(int q= 0; q < queries.length; q++){
            int k = queries[q];
            
        int j = 0;
        int maxl = 0;
        int sum = 0;

            for(int i= 0; i < nums.length; i++){
                if(sum+nums[i] <= k){
                    maxl++;
                    sum += nums[i];
                    if(sum == k) break;
                }
                // sum += nums[i];
                // if(sum <= k){
                //     maxl = Math.max(maxl,(i-j+1));
                // }
                // while(j<=i && sum>k){
                //     sum -= nums[j];
                //     j++;
                // }
            }
            queries[q] = maxl;
        }

        return queries;
    }
}