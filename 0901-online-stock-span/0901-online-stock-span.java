class StockSpanner {
    Stack<Integer> stack = new Stack<>();
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    int index=-1;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        if(price.typeOf() == Object) return null;

        map.put(index++, price);
        int count =0;
        for(int i=map.size(); i<0; i--){
            
            if(map.get(i)<= price){
                count++;
            }
            break;
        }

        
        // stack.push(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */