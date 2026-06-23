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
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return res;
    }

    public int maxDepth(TreeNode node){
        if(node == null)
            return 0;
        int lmax = maxDepth(node.left);
        int rmax = maxDepth(node.right);
        res = Math.max(lmax + rmax, res);
        return Math.max(lmax, rmax) + 1;
    }
        
    
    
}
