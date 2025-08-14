class Solution {
    public String largestGoodInteger(String num) {
/*
        HashMap<Character, Integer> map = new HashMap<>();
        int max=-1;
        String s="";

        for(int i=0; i<num.length(); i++){
            map.put(num.charAt(i), map.getOrDefault(num.charAt(i), 0)+1);
        }

        for(char key : map.keySet()){
            if(map.get(key) >=3){
                max = Math.max(max, key-'0');
            }
        }
        if(max != -1){
            s += ""+max +""+max+""+max;
        }

    return max==-1? "":s;

*/  
        int i=2, j=0;
        int max=-1;
        while(i<num.length()){
           if(i-j+1 == 3 && num.charAt(i) == num.charAt(j) && num.charAt(j+1) == num.charAt(i)){
                max = Math.max(max, num.charAt(i)-'0');
                j++;
                i++;
            }
            i++;
            j++;
        }
        return max == -1?"":""+max+""+max+""+max;

    }
}