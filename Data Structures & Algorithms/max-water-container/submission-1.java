class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        //int max_height = -1;
        int res = 0;
        while(left < right){
            res = Math.max(Math.min(heights[left], heights[right]) * (right - left), res);
            if(heights[left] > heights[right]){
                right--;
            }
            else{
                left++;
            }

        }

        return res;
        
    }
}
