/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        int index = 0;
        addNode(root, index);
        return res;
       
    }

    public void addNode(TreeNode node, int index){
        if(node == null){
            return;
        }
        if(index == res.size()){
            res.add(new ArrayList<Integer>());
        }
        
        res.get(index).add(node.val);

        addNode(node.left, index + 1);
        addNode(node.right, index + 1);

    }
}
