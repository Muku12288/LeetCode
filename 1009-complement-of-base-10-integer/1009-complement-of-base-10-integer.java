class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder s1 = new StringBuilder();
        String s = Integer.toBinaryString(n);
        // System.out.println(s);
        for(int i=0; i< s.length(); i++){
            char c = (char) ((s.charAt(i)-'0')^1+'0');
            s1.append(c);
        }

        return Integer.parseInt(s1.toString(), 2);
    }
}