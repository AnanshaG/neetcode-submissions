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
    
    public boolean isValidBST(TreeNode root) {
            
        return checkNodes(root, -1001, 1001);
             
    }

    public boolean checkNodes(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
       
            // min < val < max = -in < 3 < 5
        if(!(min < root.val && root.val < max))
            return false;
                
        return checkNodes(root.left, min, root.val) && 
                checkNodes(root.right, root.val, max );
        
    }


}
