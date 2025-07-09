class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        // /*
        List<Integer> map = new ArrayList<>();
        int end = 0, max= 0;
        int count =0, ans=0;

        
        map.add(startTime[0] );
        for(int i=1; i< startTime.length; i++){
            if(startTime[i] - end > 0){
                map.add(startTime[i] - endTime[i-1]);
               
            }
            
        }
        // for last index
        map.add(eventTime - endTime[endTime.length - 1]);
        // slide the window over map
        
        // if(map.size()==1){
        //     return map.get(0);
        // }
        // else if(map.size() <= k){
        //     for(int i=0; i< map.size(); i++){
        //         ans+=map.get(i);
        //     }
        //     return ans;
        // }
        int j=0;
        for(int i=0; i<map.size();i++){
            ans += map.get(i);
            if(i-j+1 >= k+1){
                max = Math.max(max, ans);
                ans -= map.get(j);
                j++;
            }
          
        }
        return max;


        // */
/*
        int n = startTime.length;

        List<Integer> gaps = new ArrayList<>();

        // calculating gaps
        gaps.add(startTime[0]);
        for (int i = 1; i < n; i++) {
            gaps.add(startTime[i] - endTime[i - 1]);
        }
        gaps.add(eventTime - endTime[n - 1]);

        int currentSum = 0, res = 0;

        // use sliding window on gaps array to find maximum possible gap
        // for K meetings there K+1 gaps, thus window size = K+1

        for (int i = 0; i < gaps.size(); ++i) {

            // form window of size k+1
            // if i >= k+1, add new element and remove i-(k+1) element
            currentSum += gaps.get(i) - ((i >= k + 1) ? gaps.get(i - (k + 1)) : 0);
            res = Math.max(res, currentSum);
        }

        return res;
        */
    }
}