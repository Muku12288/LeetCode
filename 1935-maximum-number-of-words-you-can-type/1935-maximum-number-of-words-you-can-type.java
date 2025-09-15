class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count = arr.length;

        for(int i=0; i<arr.length; i++){
            String s1 = arr[i];

            for(int j=0; j<brokenLetters.length(); j++){
                String s2 = String.valueOf(brokenLetters.charAt(j));
                if(s1.contains(s2)){
                    count--;
                    break;
                }
            }
        }
    return count;
    }
}