class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        if(s.length == 0)return 0;
        Arrays.sort(s);
        Arrays.sort(g);

        for(int i=0; i<g.length; i++){
            // boolean c =false;
            // int num=0,p=0;
            for(int j=0;j<s.length;j++){
                // if(c){
                //     if(s[j]<num && s[j]>= g[i]){
                //         p=j;
                //     }if(j==s.length-1)s[p]=0;
                // }
                if(s[j]!= 0 && s[j]>= g[i]){
                    count++;
                    // num = s[j];
                    s[j] =0;
                    break;
                    // c=true;
                    // p =j;
                    // if(j==s.length-1)s[p]=0;
                }
            }
        }
    return count;
    }
}