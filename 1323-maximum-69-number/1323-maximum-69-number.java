class Solution {
    public int maximum69Number (int num) {
        char[] c = {'6','9'};
        StringBuilder s = new StringBuilder(String.valueOf(num));
        
        System.out.println(s);
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == c[0]){
                s.setCharAt(i , c[1]);
                break;
            }
        }
    return Integer.parseInt(s.toString());
    }
}