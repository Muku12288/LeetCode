class Solution {
    public int[] sortByBits(int[] arr) {
        int[] result  = new int[arr.length];
        int n=0,p=0;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            int ones = countOnes(arr[i]);
            map.put(arr[i], ones);
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
        System.out.println("map complete");
        while(map.size() > 0){
            int i=0;
            while(i<arr.length){
                if(map.containsKey(arr[i]) && map.get(arr[i])==n){
                    
                    for(int k=0; k<frequency.get(arr[i]); k++){
                        result[p] = arr[i];
                        p++;
                    }
                    map.remove(arr[i]);
                    System.out.println(map.size());
                }
                i++;
            }
            n++;
        }
        return result;
    }
    
    int countOnes(int n){
        int count=0;
        while(n!=0){
            count+=n&1;
            n = n>>>1;
        }
        return count;
    }
}