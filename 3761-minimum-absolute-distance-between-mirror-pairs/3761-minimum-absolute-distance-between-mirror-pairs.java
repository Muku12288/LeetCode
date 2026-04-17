class Solution {
    public int rev(int n){
        int rev = 0, num = n;
            while(num > 0){
                int d = num%10;
                rev = (rev*10)+d;
                num = num/10;
            }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n= nums.length, mini = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        
        if(n == 1){
            return -1;
        }

        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                mini = Math.min(mini, i-map.get(nums[i]));
            }
            map.put(rev(nums[i]), i);
        }
/*      Brute force
        for(int i=0; i<n-1; i++){
            int rev = 0, num = nums[i];
            while(num > 0){
                int d = num%10;
                rev = (rev*10)+d;
                num = num/10;
            }
            for(int j = i+1; j<n; j++){
                if(nums[j] == rev){
                    mini = Math.min(mini, Math.abs(i-j));
                    break;
                }
            }
        }
        */
    return mini == Integer.MAX_VALUE? -1:mini;
    }
}