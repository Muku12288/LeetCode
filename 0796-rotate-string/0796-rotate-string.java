class Solution {
    public boolean rotateString(String s, String goal) {
    /*    
        StringBuilder str = new StringBuilder(s);
        String subs ="";
        int end=0;
        int count =0;
        if(s.length() != goal.length()){
            return false;
        }
        // point rotate index
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == goal.charAt(0)){
                end = i;
                //subs= subs+(str.toString()).substring(0,end);
                str.append((str.toString()).substring(0,end));
                str.delete(0,end);
                count+= i;
                if((str.toString()).equals(goal)){
                    return true;
                }
                if(count>= s.length()){
                    return false;
                }
                i=0;
            }
        }
        
    return false;
    */

    // Easy approach using observation;
        if (s.length()!= goal.length()) 
        {
            return false; 
        }
        
    return (s + s).contains(goal);
    }
}