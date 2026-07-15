class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, target, subset);
        return res;
    }

    public void dfs(int[] nums, int num, int remains, List<Integer> subset) {
        if (remains == 0) {
            res.add(new ArrayList<>(subset));
            return;
        }
        if (remains < 0 || num >= nums.length) {
            return;
        }

        subset.add(nums[num]);
        dfs(nums, num + 1, remains - nums[num], subset);
        subset.remove(subset.size() - 1);
        while(num < nums.length - 1 && nums[num] == nums[num + 1]){
            num++;
        }
    
        dfs(nums, num + 1, remains, subset);
    }
}
