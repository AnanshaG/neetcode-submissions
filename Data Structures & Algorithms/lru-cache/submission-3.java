class LRUCache {

    private HashMap<Integer, Node> map;
    private int capacity;
    private Node left;
    private Node right;
    private int actual = 0;
    

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        left =  new Node();
        right = new Node();
        left.next = right;
        right.prev = left;
        
    }

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node){
        Node temp = left.next;
        left.next = node;
        node.prev = left;
        node.next = temp;
        temp.prev = node;
    }
    
    public int get(int key) {

        if(map.get(key)!=null){
            Node node = map.get(key);
            remove(node);
            insert(node);//start
            return node.value;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        actual += 1;

        if(map.get(key)!=null){
            Node node = map.get(key);
            remove(node);
            actual -= 1;
        }

        Node node = new Node(key, value);

        insert(node);
        map.put(key, node);

        if(actual > capacity){
            map.remove(right.prev.key);
            remove(right.prev);
            actual --;
            
        }
        
    }
}

class Node {

	int key;
	int value;
    Node prev;
	Node next;
	
	Node(){}


	Node(int key, int value) {
        this.key = key;
		this.value = value;
	}

}
