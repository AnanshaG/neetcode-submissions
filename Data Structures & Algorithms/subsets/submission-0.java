class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, subset, res);
        return res;
        
    }

    public static void dfs(int[] nums, int num, List<Integer> subset, List<List<Integer>> result){
        if(num >= nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[num]);
        dfs(nums, num+1, subset, result);
        subset.remove(subset.size() - 1);
        dfs(nums, num+1, subset, result);
    }
}
