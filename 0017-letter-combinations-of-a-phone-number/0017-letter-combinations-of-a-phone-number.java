class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();// = Map.of( '2',"abc", '3',"def", '4',"ghi", '5',"jkl",
                                           //  '6',"mno",'7',"pqrs", '8',"tuv", '9',"xyz");
        List<String> list = new ArrayList<>();
        
        if(digits.length() == 0){
            return list;
        }

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

       combination(digits, new StringBuilder(), 0,  map, list);
        return list;

    }

    static void combination(String digits,StringBuilder s,int index, Map<Character, String> map, List<String> list){
        if(index == digits.length()){
            list.add(s.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i=0; i< letters.length(); i++){
        // for(char letter : letters.toCharArray()){
            s.append(letters.charAt(i));
            combination(digits, s, index+1,  map, list);
            s.deleteCharAt(s.length() -1);
        }
    }

}