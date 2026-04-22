class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();

        for(int i=0; i<queries.length; i++){
            String s1 = queries[i];
            for(int j=0; j<dictionary.length; j++){
                int p=0, c=0;
                String s2 = dictionary[j];
                while(p<s2.length()){
                    if(s1.charAt(p) != s2.charAt(p))c++;
                    p++;
                }
                if(c<=2){
                    ans.add(s1);
                    break;
                }
            }
        }
    return ans;
    }
}