// duynotes.blogspot.com
class Node{
    private int val;
    private int min;
    private Node next;
    
    public Node(int val, int min){
        this.val = val;
        this.min = min;
    }
    
    public int getVal(){return val;}
    public int getMin(){return min;} 
    public Node getNext(){return next;}
    
    public void setVal(int val){this.val = val;}
    public void setMin(int min){this.min = min;}    
    public void setNext(Node next){this.next = next;}
    
}
