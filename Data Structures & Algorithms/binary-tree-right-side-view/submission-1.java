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
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        //DFS
        showNode(root, 0);
        return res;


    }

    public void showNode(TreeNode node, int index){
        if(node == null)
            return;
        if(index == res.size())
            res.add(node.val);
        showNode(node.right, index + 1);
        showNode(node.left, index + 1);

    }
}
