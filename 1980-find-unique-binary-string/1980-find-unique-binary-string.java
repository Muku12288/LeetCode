class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums[0].length();
        int j=(int)Math.pow(2, n)-1;

        for(int i=0; i<nums.length; i++){
            int num = Integer.parseInt(nums[i], 2);
            set.add(num);
        }

        while(j>=0){
            if(!set.contains(j)){
                String op = Integer.toBinaryString(j);
                if(op.length() != n){
                    op = "0"+op;
                }
                return op;
            }
            j--;
        }
        return "";
    }
}