class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int mini = Integer.MAX_VALUE, n = words.length,count=0;

        int i=startIndex,j=startIndex;
        if(words[i].equals(target))return 0;
        
        while(count < n){
            // i=(i+1)%n;
            
            if(words[(i+1)%n].equals(target)){
                System.out.println("Executed 1");
                mini = Math.min(mini, count+1);
            }
            if(words[(j-1+n)%n].equals(target)){
                System.out.println("Executed");
                mini = Math.min(mini, count+1);
                // Math.abs(n-(startIndex-((j-1+n)%n)))
            }
            i++;
            j--;
            count++;
        }
    return mini == Integer.MAX_VALUE? -1: mini;
    }
}