class Solution {
    public int numberOfSpecialChars(String word) {
        int[] upper = new int[27];
        int[] lower = new int[27];
        int count =0;

        for(int i=0; i<26; i++){
            lower[i] = -1;
            upper[i] = -1;
        }

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(Character.isLowerCase(c)){
                lower[c-'a'] = i;
            }else{
                char s = Character.toLowerCase(c);
                if(upper[s-'a'] ==-1){
                    upper[s-'a']=i;
                }
            }
        }

        for(int i=0; i<26; i++){
            System.out.println(upper[i] +" "+lower[i]);
            if((upper[i] >lower[i]) && (lower[i] != -1)){
                count ++;
            }
        }

        return count;
    }
}