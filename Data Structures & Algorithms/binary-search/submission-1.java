class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;

        while(l <= r){
            mid  = (r+l)/2;
            if(nums[mid] < target ){
                l = mid;
                l++;
                
            }
            else if(nums[mid] > target){
                r = mid;
                r--;
            }
            else {
                return mid;
            }
        }

        return -1;
        
    }
}
