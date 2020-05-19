//duynotes.blogspot.com
class StockSpanner {
    private Stack<Integer> stk;
    private int i;
    private List<Integer> list;
    
    public StockSpanner() {
        stk = new Stack<>();
        i=-1;
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        i++;
        
        while (!stk.isEmpty() && list.get(stk.peek()) <= price){
            stk.pop();
        }
        
        int res = stk.isEmpty() ? i+1: i-stk.peek();
        stk.push(i);
        list.add(price);
        
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
