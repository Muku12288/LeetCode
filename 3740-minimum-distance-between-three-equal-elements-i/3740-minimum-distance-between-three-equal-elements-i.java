class Solution {
    public int minimumDistance(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // Set<Integer> set = new Set<>();
        if(nums.length<3){
            return -1;
        }

        // for(int i=0; i<nums.length; i++){
        //     set.add(nums[i]);
        //     map.put(i, nums[i]);
        // }
        int j=0, sum = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            j=0;
            for(int k=i+1; k<nums.length;k++){
                if(nums[k]== nums[i] && j==0){
                    j=k;
                }else if(nums[k]== nums[i] && j!=0){
                    System.out.println(i+" "+j+" "+k);
                    sum = Math.min(sum, Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i));
                }
            }

        }
        return sum == Integer.MAX_VALUE? -1: sum;
    }
}