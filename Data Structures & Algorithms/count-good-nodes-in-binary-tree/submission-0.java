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
    
    int res = 0;
    
    public int goodNodes(TreeNode root) {
        
        int max_yet = -100;
        checkNode(root, max_yet);
        return res;
    }

    public void checkNode(TreeNode node, int num){
        if(node == null)
            return;
        if(node.val >= num){
            res += 1 ;
            num = node.val;
        }
        checkNode(node.left, num);
        checkNode(node.right, num);
    }
}
