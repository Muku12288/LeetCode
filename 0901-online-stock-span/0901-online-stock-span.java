class StockSpanner {
    Stack<Integer> stack = new Stack<>();//
    // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    List<Integer> arr;
    int count;
    // int index=-1;
    public StockSpanner() {
        arr = new ArrayList<>();
        count =0;
    }
    
    public int next(int price) {
        // if(price.typeOf() == Object) return null;

        // map.put(index++, price);
        arr.add(price);
        count=0;
        for(int i=arr.size()-1; i>=0; i-- ){
            if(arr.get(i) <= price){
                count++;
            }else{
                break;
            }
        }
        
        // for(int i=map.size(); i<0; i--){
            
        //     if(map.get(i)<= price){
        //         count++;
        //     }
        //     break;
        // }

        
        // stack.push(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */