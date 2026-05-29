class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;

        for(int i:nums){
            int n=i;
            int sum =0;
            while(n!=0){
                int r = n%10;
                sum+=r;
                n = n/10;
            }
            mini = Math.min(mini, sum);
        }
    return mini;
    }
}