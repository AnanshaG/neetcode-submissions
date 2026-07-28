class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(nums, 0, sub, res);
        return res;
        
    }

    public void dfs(int[] nums, int ind, List<Integer> sub, List<List<Integer>> res){

        res.add(new ArrayList<>(sub));

        for(int i = ind; i < nums.length; i++){
            sub.add(nums[i]);
            dfs(nums, i + 1, sub, res);
            sub.remove(sub.size() - 1);
        }
    }
}
