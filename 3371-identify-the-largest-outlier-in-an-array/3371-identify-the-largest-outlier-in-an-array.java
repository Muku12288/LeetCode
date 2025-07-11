class Solution {
    public int getLargestOutlier(int[] A) {
        /*
        int i=0, arrsum=0,num=0,ans=Integer.MIN_VALUE,min=0;
        Map<Integer, Integer> map = new HashMap<>();

       while(i<nums.length){
            arrsum  += nums[i];
            min = Math.min(min, arrsum);

            map.put(nums[i], map.getOrDefault(map.get(nums[i]),0)+1);
            i++;
       }
       if(map.size()==1){
        return nums[0];
       }

       for(int j=nums.length-1; j>=0; j--){
            
            num = arrsum-nums[j];

            System.out.println(num);
            if(num%2 == 0 && map.containsKey(num/2)){
                 System.out.println(map.get(nums[j]));
                if(map.get(nums[j])>1 || (nums[j]!=num/2)){
                    ans = Math.max(ans, nums[j]);
                }      
               
            }
       }
        
    return ans;
    */

     Map<Integer, Integer> count = new HashMap<>();
        int total = 0, res = Integer.MIN_VALUE;
        for (int a : A) {
            total += a;
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        for (int a : A) {
            int outlier = total - a - a;
            if (count.getOrDefault(outlier, 0) > (outlier == a ? 1 : 0)) {
                res = Math.max(res, outlier);
            }
        }
        return res;
    }
}