class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
      /*for(int i=n-1; i>=0; i--){
            int num = nums[i];
            while(num!=0){
                arr.add(0,num%10);
                num = num/10;
            }   
            
        }   */
        for(int i=0; i<n; i++){
            String s = String.valueOf(nums[i]);
            for(char c : s.toCharArray()){
                arr.add(c-'0');
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }

      return ans;
    }
}