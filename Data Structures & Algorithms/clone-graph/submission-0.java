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

        Node node_n = dfs(node, hash);
        return node_n;
        
    }

    public Node dfs(Node nodes, HashMap<Node, Node> map){
        if(nodes == null){
            return null;
        }
         if(!map.containsKey(nodes)){
                map.put(nodes, new Node(nodes.val));
                for(Node node : nodes.neighbors){
                    map.get(nodes).neighbors.add(dfs(node, map));
                }
            }
        return map.get(nodes);
        
    }
}