class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        int vmax =0, cmax =0;

        for(int i =0; i< s.length(); i++){
            int num = s.charAt(i) - 'a';
            arr[num] = arr[num]+1;
        }
        
        for(int i=0; i<arr.length; i++){
            if(i==0 ||i==4 ||i==8 ||i==14 ||i==20){
                vmax = Math.max(vmax, arr[i]);
            }else{
                cmax = Math.max(cmax, arr[i]);
            }
        }
        return vmax+cmax;
    }
}