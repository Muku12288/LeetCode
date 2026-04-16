class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int mini = Integer.MAX_VALUE, n = words.length,count=0;

        int i=startIndex,j=startIndex;
        if(words[i].equals(target))return 0;

        while(count < n){
            if(words[(i+1)%n].equals(target)){
                mini = Math.min(mini, count+1);
            }
            if(words[(j-1+n)%n].equals(target)){
                mini = Math.min(mini, count+1);
               
            }
            i++;
            j--;
            count++;
        }
    return mini == Integer.MAX_VALUE? -1: mini;
    }
}