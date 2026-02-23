class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set =  new HashSet<>();
        int i=0, j=k-1;

        while((j-i+1 == k) && j<s.length()){
            set.add(s.substring(i, j+1));
            j++;
            i++;
        }
    return set.size() == Math.pow(2, k);
    }
}