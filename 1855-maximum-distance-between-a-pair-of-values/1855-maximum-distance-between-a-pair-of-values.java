class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n1=nums1.length, n2 = nums2.length, maxi = 0,j=0;
/*
        for(int i=0; i<n1; i++){
            if(j<i)j =i+1;
            while(j<n2 && nums1[i] <= nums2[j]){
              j++;   
              
            }
            maxi = Math.max(maxi, j-i-1);
        }*/
        int i=0;
        while(i<n1 && j<n2 ){
            if(nums1[i] <= nums2[j]){
                maxi = Math.max(maxi, j-i);
                j++;
            }else{
                i++;
            }
               
              
        }

    return maxi;
    }
}