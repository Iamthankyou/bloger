// duynotes.blogspot.com
class MinStack {
    
    public Node head;

    public MinStack() {
        
    }
    
    public void push(int x) {
        if (head==null){
            head = new Node(x,x);
        }
        else{
            Node tmp = head;
            head = new Node(x,Math.min(x,head.getMin()));
            head.setNext(tmp);
        }
    }
    
    public void pop() {
        head = head.getNext();
    }
    
    public int top() {
        return head.getVal();
    }
    
    public int getMin() {
        return head.getMin();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
