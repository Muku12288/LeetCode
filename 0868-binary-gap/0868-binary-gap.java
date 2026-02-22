class Solution {
    public int binaryGap(int n) {
        
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int i=0, j=1;
        int len = 0;
        while(i<s.length() && j<s.length()){
            if(s.charAt(i) == '1'){
                while(j<s.length() && s.charAt(j) == '0'){
                    j++;
                }
                if(j < s.length()){
                    len = Math.max(len, j-i);
                    // i=j+1;
                }
                
            }
            i++;
        }
        return len;
    }
  
}