class Solution {
    public boolean checkInclusion(String s1, String s2) {

        //slidind window approach 
        
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        
        if(s1.length()>s2.length()) return false;
        
        for(int i=0; i< s1.length(); i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }

        int left = 0, right;
       for(right=s1.length(); right<s2.length(); right++){
            if(Arrays.equals(s1count, s2count)) return true;
           
            s2count[s2.charAt(left)-'a']--;
            s2count[s2.charAt(right)-'a']++;
            left++;
       }
       if(right== s2.length() && Arrays.equals(s1count, s2count)){
        return true;
       }

    return false;











        // boolean isPresent = false;
        // String op= "";
        // boolean present =false;

        // if(s1.length() == 1){
        //     return s2.contains(s1);
        // }
        // else if(s1.length() == 2){
        //     op += s1.substring(1)+s1.substring(0);
        //     if(s2.contains(s1) || s2.contains(op)){
        //         return true;
        //     }
                
        // }

        // return permutation(s1, op, s2, present);
    }

    // boolean permutation(String ip, String op, String s2, boolean present){
    //     String nip="", nop="";
    //     // boolean present=false;
    //     if(ip.length()==0){
    //        if(s2.contains(op)){present = true;}
    //        return s2.contains(op)? true : false; 
    //     }

    //     for(int i=0; i< ip.length();i++){
    //         nip += ip.substring(0, i)+ ip.substring(i+1, ip.length());
    //         nop += op + ip.substring(i);
    //         // present = permutation(nip, nop, s2);
    //         // if(present){
    //         //     return true;
    //         // }
    //         return permutation(nip, nop, s2, present);
    //         // return present;
    //     }
    // return false;
    // }
}