class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                curr = nums[i];
            }
            if(curr == nums[i]){
                count++;
            }
            else{
                count--;
            }

            i++;
        }

        return curr;
    }
}