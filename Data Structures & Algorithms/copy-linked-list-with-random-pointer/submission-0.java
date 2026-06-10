/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node dummy = new Node(0);
        Node prev = dummy;

        HashMap<Node, Node> nodes = new HashMap<>();
        
        while(curr!=null){
            Node node = new Node(curr.val);
            nodes.put(curr, node);
            curr = curr.next;
        }

        curr = head;

        while(curr!=null){
            nodes.get(curr).next = nodes.get(curr.next);
            nodes.get(curr).random = nodes.get(curr.random);
            prev.next = nodes.get(curr);
            prev = nodes.get(curr);
            curr = curr.next;

        }

        
    return dummy.next;

        
    }
}
