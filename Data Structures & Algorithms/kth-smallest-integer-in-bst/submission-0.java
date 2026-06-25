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
    int counter = 0;
    int res = -1;
    public int kthSmallest(TreeNode root, int k) {
       checkNode(root, k);
       return res;
        
    }
    public void checkNode(TreeNode root, int k){
         if(root == null){
            return;
        }

        checkNode(root.left, k);
        counter += 1;
        if(counter == k){
            res = root.val;
            return ;
        }
        checkNode(root.right, k);
    }
}
