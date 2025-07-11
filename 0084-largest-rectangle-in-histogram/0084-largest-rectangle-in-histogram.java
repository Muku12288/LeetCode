class Solution {
    public int largestRectangleArea(int[] h) {
        long maxrectangle =0;
        int len =0;
        Stack<int[]> stackr = new Stack<>();
        Stack<int[]> stackl = new Stack<>(); //stackr.push(new int[]{val, smallindex,original index});

        //1. Find smaller element/ index at right
        stackr.push(new int[]{h[h.length-1], h.length});//for last index whem look for right
        for(int i=h.length-2; i>=0; i--){
            len = stackr.size()-1;
            while(len>=0 && stackr.get(len)[0] >= h[i]){
                len--;
            }
            if(len==-1)stackr.push(new int[]{h[i], h.length});
            else stackr.push(new int[]{h[i], h.length-1-len});
        }

        //2. Find smaller element/ index at left
        stackl.push(new int[]{h[0], -1}); 
        maxrectangle = Math.max(maxrectangle, (stackr.peek()[1] - stackl.get(0)[1] -1)*stackl.get(0)[0]);
        stackr.pop();
        for(int i=1; i<h.length; i++){
            len = stackl.size()-1;
            while(len>=0 && stackl.get(len)[0] >= h[i]){
                len--;
            }
            stackl.push(new int[]{h[i], len});

            maxrectangle = Math.max(maxrectangle, (stackr.peek()[1] - 
            stackl.get(i)[1] -1)*stackl.get(i)[0]);
            stackr.pop();
        }

    return (int)maxrectangle;
    }
}