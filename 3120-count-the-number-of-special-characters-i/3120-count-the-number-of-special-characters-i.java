class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            char s = (c == Character.toUpperCase(c)) ?Character.toLowerCase(c): Character.toUpperCase(c);
           System.out.println(s);
            if(!arr.contains(i)){
                for(int j = i+1; j<word.length();j++){
                    if(word.charAt(j) == s && !arr.contains(j)){
                        count++;
                        arr.add(j);
                        set.add(Character.toUpperCase(s));
                        break;
                    }
                }
            }
        }
    
       
    return set.size();
    }
}