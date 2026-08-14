class Solution {
    public int trap(int[] height) {

        int left = 0;
        int max_l_yet = 0;
        int max_r_yet = 0;
        int[] left_side = new int[height.length];
        int[] right_side = new int[height.length];
        for(int i = 0; i < height.length; i++){
            left_side[i] = max_l_yet;
            max_l_yet = Math.max(max_l_yet, height[i]);
            right_side[height.length - 1 - i] = max_r_yet;
            max_r_yet = Math.max(max_r_yet, height[height.length - 1 - i]);
        }

        int water = 0;
        for(int i = 0; i < height.length; i++){
            int w = Math.min(left_side[i], right_side[i]) - height[i];
            if(w > 0){
                water+=w;
            }
        }

        return water;
        
    }
}
