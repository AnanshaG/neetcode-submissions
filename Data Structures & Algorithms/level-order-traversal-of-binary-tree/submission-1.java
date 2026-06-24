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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //BFS with queue
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            //System.out.println("at outer loop");
            List<Integer> l = new ArrayList<Integer>();
            for(int i = q.size(); i > 0 ; i--){
                //System.out.println("q size: " + q.size());
                TreeNode node = q.poll();
               // System.out.println("node : " + node.val);
                if(node!=null){
                l.add(node.val);
                q.offer(node.left);
                q.offer(node.right);
                }
            }

            if(l.size() > 0){
                res.add(l);
            }

        }
        return res;
        
    }
}
