class Solution {
    
    public int areaOfMaxDiagonal(int[][] dimensions) {
        /*
        int msum =0, sum=0,area=0;
        for(int i=0; i<dimensions.length; i++){

            sum = (dimensions[i][0]*dimensions[i][0]) + (dimensions[i][1]*dimensions[i][1]);
            if(sum>msum ){
                area = dimensions[i][0] * dimensions[i][1];
                msum = sum;

            }else if(sum == msum && area < dimensions[i][0] * dimensions[i][1]){
                area = dimensions[i][0] * dimensions[i][1];
                msum = sum;
            }
        }
        return area;*/
        int area=0;
        double sum =0.0, maxsum =0.0;
        for(int i=0; i<dimensions.length; i++){
            //
            sum = Math.sqrt((dimensions[i][0]*dimensions[i][0]) + (dimensions[i][1]*dimensions[i][1]));
            if(sum > maxsum){
                area = dimensions[i][0]*dimensions[i][1];
                maxsum = sum;
            }
            else if(sum == maxsum && (dimensions[i][0]*dimensions[i][1]) > area){
                area = dimensions[i][0]*dimensions[i][1];
            }
        }
        return area;
    }
}