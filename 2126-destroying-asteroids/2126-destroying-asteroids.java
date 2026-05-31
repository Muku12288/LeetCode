class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        long currMass=mass;
        Arrays.sort(a);

        for(int ast:a){
            if(currMass < ast){
                return false;
            }
            currMass+=ast;
        }
        return true;
    }
}