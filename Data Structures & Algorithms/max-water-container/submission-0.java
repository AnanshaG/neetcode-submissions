class Solution {
    public int maxArea(int[] heights) {

    int maxArea = 0;

    int l = 0;
    int r = heights.length - 1;

    while(l < r){
        maxArea = Math.max(Math.min(heights[l], heights[r]) * (r-l), maxArea);
        if(heights[r] > heights[l]){
            l++;
        }
        else{
            r--;
        }
    }

    return maxArea;
        
    }
}
