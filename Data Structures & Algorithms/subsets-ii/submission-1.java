class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(nums, 0, res, sub);
        return res;
        
    }

    public void dfs(int[] nums, int num, List<List<Integer>> res, List<Integer> sub){
        if(num >= nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[num]);
        dfs(nums, num+1, res, sub);
        sub.remove(sub.size()-1);
        while(num < nums.length - 1 && nums[num] == nums[num+1]){
            num++;
        }
        dfs(nums, num+1, res, sub);
    }
}
