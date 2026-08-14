/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        HashMap<Node, Node> hash = new HashMap<>();
        //created a hashmap to store the new node created corresponding to the old node
        Node node_n = dfs(node, hash);
        return node_n;
        
    }

    public Node dfs(Node nodes, HashMap<Node, Node> map){
        if(nodes == null){ // if the node itself is null then null
            return null;
        }
        //check if its new node or has been already created in hashmap?
        //if new node put it against the old node and go thru the list of 
        //old node and call the dfs function for the new node and add in 
        //neighbours list else return the new node created back to the
        //original function call.
         if(!map.containsKey(nodes)){
                map.put(nodes, new Node(nodes.val));
                for(Node node : nodes.neighbors){
                    map.get(nodes).neighbors.add(dfs(node, map));
                }
            }
        return map.get(nodes);
        
    }
}