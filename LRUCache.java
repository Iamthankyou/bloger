//duynotes.blogspot.com

class Node{
    private Node prev;
    private Node next;
    private int key;
    private int value;
    
    Node(int key, int val){
        this.key = key;
        this.value = val;
    }
    
    public Node getPrev(){return prev;}
    public void setPrev(Node prev){ this.prev = prev;}
    public Node getNext(){return next;}
    public void setNext(Node next){ this.next = next;}
    public int getKey(){return key;};
    public void setKey(int key){this.key = key;}
    public int getValue(){return value;}
    public void setValue(int value){this.value = value;}
}

class LRUCache {
    private Node head;
    private Node tail;
    private HashMap<Integer,Node> map;
    int cap = 0;
    
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if (map.get(key) == null){
            return -1;
        }
        
        Node node = map.get(key);
        remove(node);
        addTail(node);
        return node.getValue();
        
    }
    
    public void remove (Node node){
        if (node.getPrev() != null){
            node.getPrev().setNext(node.getNext());
        }
        else{
            head = node.getNext();
        }
        
        if (node.getNext()!=null){
            node.getNext().setPrev(node.getPrev());
        }
        else{
            tail = node.getPrev();
        }
    }
    
    public void addTail(Node node){
        if (tail!=null){
            tail.setNext(node);
        }
        
        node.setPrev(tail);
        node.setNext(null);
        tail = node;
        
        if (head == null){
            head = tail;
        }
    }
    
    public void put(int key, int value) {
        if (map.get(key) != null){
            Node node = map.get(key);
            node.setValue(value);
            
            remove(node);
            addTail(node);
        }else{
            if (map.size()==cap){
                map.remove(head.getKey());
                remove(head);
            }  
            
            Node node = new Node(key,value);
            addTail(node);
            map.put(key,node);
        } 
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
