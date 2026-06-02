class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int mini = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int duration=0;
                if(landStartTime[i] <= waterStartTime[j]){
                    duration = landStartTime[i]+landDuration[i]+waterDuration[j];
                    int rem = waterStartTime[j] - (landStartTime[i]+landDuration[i]);
                    if(rem >0){
                        duration+=rem;
                    }
                }else{
                    duration = waterStartTime[j]+waterDuration[j]+landDuration[i];
                    int rem = landStartTime[i] - (waterStartTime[j]+waterDuration[j]);
                    if(rem >0){
                        duration+=rem;
                    }
                }
                mini = Math.min(mini, duration);
            }
        }
    return mini;
    } 
}