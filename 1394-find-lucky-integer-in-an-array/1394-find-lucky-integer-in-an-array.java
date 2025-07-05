class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        //Iterate map
        for(Integer num : map.keySet()){
            if(map.get(num) == num){
                max = Math.max(max, num.intValue());
            }
        }
    return max;
    }
}