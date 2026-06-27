class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            if(i!=0 && nums[i-1] == nums[i]){
                continue;
            }
            int target = -1 * nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int curr = nums[left] + nums[right];
            
                if(curr < target){
                    left ++;
                }
                else if(curr > target){
                    right --;
                }
                else{
                    List<Integer> a = Arrays.asList(nums[i], nums[left], nums[right]);
                    if(!res.contains(a))
                        res.add(a);
                    left++;
                    right--;
                }
            }
        }

        return res;
        
    }
}
