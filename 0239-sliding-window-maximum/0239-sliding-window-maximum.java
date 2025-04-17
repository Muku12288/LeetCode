class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // ArrayList<Integer>list = new ArrayList<>();
        List<Integer>set = new ArrayList<>();
        
        // int arr[]=new int[nums.length-k+1];
         
        // int i =0;
        // int j=0;
        // int count=0;
        // int numOfWindow =nums.length-k+1;

        // if(nums.length ==0 || k==0){
        //     return new int[0];
        // }

        // for(j=0; j<k-1; j++){
            
        //         set.add(nums[j]);
            
        // }
        // while(j<nums.length){
        //     set.add(nums[j]);
        //     arr[count] = Collections.max(set);
        //     count++;
        //     // list.add(Collections.max(set));
        //     set.remove(Integer.valueOf(nums[i]));
        //     i++;
        //     j++;
        // }
        
        // for (int start = 0; start < numOfWindow; ++start) {
        //     int end = start + k - 1;
        //     int maxVal = nums[start];
        //     for (int i = start + 1; i <= end; ++i) {
        //     if (nums[i] > maxVal) { // update
        //         maxVal = nums[i];
        //     }
        //     }
        //     arr[start] = maxVal;
        // }
        // return arr;

         Deque<Integer> q = new ArrayDeque<>();  // stores *indices*
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
                q.removeLast();
            }
            q.addLast(i);
            // remove first element if it's outside the window
            if (q.getFirst() == i - k) {
                q.removeFirst();
            }
            // if window has k elements add to results (first k-1 windows have < k elements because we start from empty window and add 1 element each iteration)
            if (i >= k - 1) {
                res.add(nums[q.peek()]);
            }
        }
        return res.stream().mapToInt(i->i).toArray();            
    
    }
}