
class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int num = 0; num <= nums.length - 1; num++){
            if(map.containsKey(nums[num])){
                return new int[]{map.get(nums[num]), num};
            }
            else{
                int comp = target - nums[num];
                map.put(comp, num);
            }
         }
        return nums;
    }
}
