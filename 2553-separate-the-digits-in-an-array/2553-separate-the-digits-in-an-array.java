class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            int num = nums[i];

            while(num!=0){
                ans.add(0,num%10);
                num = num/10;
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        
      return arr;
    }
}