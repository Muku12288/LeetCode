
import java.util.Collections;

class Solution {
    public String sortVowels(String s) {
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        StringBuilder s1= new StringBuilder(s);
        int i=0;
        
        
        while(i<s.length()){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c== 'e' || c == 'i' || c== 'o' || c == 'u'){
                int a = s.charAt(i);
                list.add(a);
                index.add(i);
            }
            i++;
        }
        if(list.size() ==0 && index.size()==0) return s;

        Collections.sort(list);
        for(int j =0; j<list.size(); j++){
            s1.setCharAt(index.get(j), (char)(list.get(j)).intValue());
        }


        return s1.toString();
    }
}