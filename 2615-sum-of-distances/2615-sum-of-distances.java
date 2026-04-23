class Solution {
    public long[] distance(int[] nums) {
        /*
        Map<Integer, List<Integer>> map= new HashMap<>();
        int n = nums.length;
        long[] arr = new long[n];

        for(int i=0; i<n; i++){
           
            List<Integer>list = new ArrayList<>();
            if(!map.containsKey(nums[i])){
                list.add(i);
                map.put(nums[i], list);
                arr[i] = 0;
            }else{
               
                list = map.get(nums[i]);
                arr[i]=0;
                int j=0;
                while(j<list.size()){
                    int inx = list.get(j);
                    arr[inx] += Math.abs(inx-i);
                    arr[i] += Math.abs(i-inx);
                    j++;
                }
                list.add(i);
                map.put(nums[i], list);
            }
                
        }

        return arr;
        */
        int n = nums.length;
        long[] ans = new long[n];

        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> pos : mp.values()) {

            long sum = 0;
            for (int x : pos) sum += x;

            long leftSum = 0;
            int m = pos.size();

            for (int i = 0; i < m; i++) {
                long rightSum = sum - leftSum - pos.get(i);

                long left  = (long) pos.get(i) * i - leftSum;
                long right = rightSum - (long) pos.get(i) * (m - i - 1);

                ans[pos.get(i)] = left + right;

                leftSum += pos.get(i);
            }
        }

        return ans;
    }
}