class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int count=0, j=0,i=0;
        if(s.length == 0)return 0;
        Arrays.sort(s);
        Arrays.sort(g);
/*      .........................O(N2) .........................
        for(int i=0; i<g.length; i++){
            for(int j=0;j<s.length;j++){
                if(s[j]!= 0 && s[j]>= g[i]){
                    count++;
                    s[j] =0;
                    break;
                    
                }
            }
        }*/
        while(i<g.length && j<s.length){
            System.out.println(g[i]+" "+s[j]);
            if( s[j]>= g[i]){
                j++;
                i++;
                count++;
            }else if(s[j]<g[i]){
                j++;
            }
            // i++;
        }
    return count;
    }
}