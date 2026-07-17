class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, res);
        return res;
    }

    void dfs(int[] nums, int num, List<List<Integer>> res){

        if(num == nums.length - 1){
            res.add(Arrays.stream(nums)
            .boxed().collect(Collectors.toList()));
            return;
        }
        for(int i = num; i < nums.length; i++){
            swap(nums, num, i);
            dfs(nums, num+1, res);
            swap(nums, num, i);

        }
    }

    void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
    }
}
