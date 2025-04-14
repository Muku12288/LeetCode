class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes+numZeros && k>= numOnes)return numOnes;
        if(k > numOnes+numZeros)return numOnes-(k-(numOnes+numZeros));
        
    return k;
    }
}