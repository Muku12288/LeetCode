class Solution {
    public int jump(int[] nums) {
        int l=0, r=0, n= nums.length;
        int steps=0;

        while(r<n-1){
            int max= 0;
            while(l<=r){
                max = Math.max(max, l+nums[l]);
                l++;
            }
            l=r+1;
            r=max;
            steps++;
        }
        return steps;
    }
}