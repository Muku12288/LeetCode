class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int n = nums.length;
        List<Integer> stack = new LinkedList<>();

        for(int num : nums){
            stack.add(num);

            while(stack.size()>1){
                int a = stack.getLast();
                int b = stack.get(stack.size() - 2);

                int g = gcd(a, b);
                if(g == 1)break;

                stack.removeLast();
                stack.removeLast();
                long lcm = a;
                stack.add((int) a/g*b);
            }
        }
        return stack;
    }

    public int gcd(int a, int b){
        return b==0? a :gcd(b, a%b);
    }
}