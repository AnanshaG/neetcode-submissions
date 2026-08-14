class Solution {
    public int trap(int[] height) {

        int left = 0;
        int max_yet = 0;
        int[] left_side = new int[height.length];
        for(int i = 0; i < height.length; i++){
            left_side[i] = max_yet;
            max_yet = Math.max(max_yet, height[i]);
        }

        max_yet = 0;
        int[] right_side = new int[height.length];
        for(int i = height.length - 1; i >= 0; i--){
            right_side[i] = max_yet;
            max_yet = Math.max(max_yet, height[i]);
        }

        //System.out.println(Arrays.toString(left_side));
        //System.out.println(Arrays.toString(right_side));
        

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
