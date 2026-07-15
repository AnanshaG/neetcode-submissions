class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, target, subset, res);
        return res;
        
    }

    public void dfs(int[] nums, int num ,int target, List<Integer> subset, List<List<Integer>> res){
        int sumSub = subset.stream().mapToInt(Integer::intValue).sum();
        if( sumSub == target){
            ArrayList<Integer> sub_res = new ArrayList<>(subset);
            if(!res.contains(sub_res))
                res.add(sub_res);
        }
        
        if(num >= nums.length || sumSub > target){
            return;
        }
        subset.add(nums[num]);
        dfs(nums, num, target, subset, res);
        subset.remove(subset.size() - 1);
        dfs(nums, num+1, target ,subset, res);
    }
}
