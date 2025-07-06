class FindSumPairs {
    int[] nums1;
    int[] nums2;
    // Map<Integer, Integer> nums2 = new LinkedHashMap<>();
    Map<Integer, Integer> n2 = new HashMap<>();
    int count =0;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for(int i: nums2){
            this.n2.put(i, this.n2.getOrDefault(i, 0)+1);
        }
        // for(int i=0; i<nums2.length; i++){
        //     this.nums2.put(i, nums2[i]);
        // }
    }
    
    public void add(int index, int val) {
        n2.put(nums2[index], n2.get(nums2[index])-1);
        nums2[index] += val; 
        n2.put(nums2[index], n2.getOrDefault(nums2[index], 0)+1);
        
    }
    
    public int count(int tot) {
        count =0;
        for(int i=0; i< nums1.length; i++){

            count += n2.getOrDefault(tot-nums1[i], 0);
                 
        }
        // for(int i=0; i< nums2.size(); i++){
        //     // if(this.nums1.containsKey(tot-nums2.get(i)) ){
        //         count += nums1.getOrDefault(tot-nums2.get(i), 0);
        //     // }
        // }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */