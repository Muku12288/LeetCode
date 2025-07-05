import java.util.SortedMap;

class Solution {
    public String convert(String s, int numRows) {
        int i=0;
        int f = 0, b = -1;
        String ans ="";
        String p="";


        Map<Integer, String> map = new LinkedHashMap<>();
        if(numRows == 1){return s;}

        while(i<s.length()){
             if (b == - 1) {
                b=numRows-1;
                
                while (f <= b && i<s.length()) {
                    p="";
                    p = map.getOrDefault(f, "");
                    p += s.charAt(i);
                    map.put(f, p);
                    f++;
                    i++;
                    
                }
            }
            if (f >= b) {
                f=0;
                b--;
                
                while (f <= b && i<s.length()) {
                    p="";
                    p= map.getOrDefault(b, "");
                    p+= s.charAt(i);
                    map.put(b, p);
                    b--;;
                    i++;
                }
                f++;
            }
        }
           
        for(Integer row: map.keySet()){
            ans += map.get(row);
        }
     return ans;      
    }
}