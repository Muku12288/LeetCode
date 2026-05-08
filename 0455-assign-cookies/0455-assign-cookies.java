class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        if(s.length == 0)return 0;
        Arrays.sort(s);
        Arrays.sort(g);

        for(int i=0; i<g.length; i++){
            for(int j=0;j<s.length;j++){
                if(s[j]!= 0 && s[j]>= g[i]){
                    count++;
                    s[j] =0;
                    break;
                    
                }
            }
        }
    return count;
    }
}