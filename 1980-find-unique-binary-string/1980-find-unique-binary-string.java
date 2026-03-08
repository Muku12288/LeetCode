class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums[0].length();
        System.out.println(n);
        int j=(int)Math.pow(2, n)-1;
        System.out.println(j);

        for(int i=0; i<nums.length; i++){
            int num = Integer.parseInt(nums[i], 2);
            System.out.print(num+" ");
            set.add(num);
        }
        System.out.println(set.toString());

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