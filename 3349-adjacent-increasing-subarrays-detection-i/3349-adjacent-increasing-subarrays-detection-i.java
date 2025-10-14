class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(2*k > nums.size()){
            return false;
        }
        if(k== 1){
            return true;
        }
        int i=0,j=k;
        while(j+k<=nums.size()){
            for(int l=i; l<i+k-1; l++){
                if(nums.get(l+1)<nums.get(l)){
                    break;
                }
                if(nums.get(l+1)>nums.get(l) && l+2==j){
                    System.out.println(l);
                    for(int r=j; r<j+k-1; r++){
                        if(nums.get(r+1)<nums.get(r)){
                             System.out.println("r"+ r);
                            break;
                        }
                        if(r==j+k-2 && nums.get(r)<nums.get(r+1)){
                            return true;
                        }
                    }
                    
                }
            }

            
            
            i++;
            j++;
        }
    return false;
    }
}