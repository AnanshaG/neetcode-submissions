class Solution {
    public int trap(int[] height) {
        int l = 1;
        int r = height.length - 2;
        int maxL = height[0];
        int maxR = height[height.length - 1];
        int sum = 0;
        while(l <= r){

            
            if(maxL <= maxR){
                sum += maxL - height[l] > 0 ? maxL - height[l] : 0;
                //System.out.println("l - " + l + "sum " +  sum );
                maxL = Math.max(maxL, height[l]);
                l++;
            }
            else{
                sum +=  maxR - height[r] > 0 ? maxR - height[r] : 0;
                //System.out.println("r - " + r + "sum " + sum);
                maxR = Math.max(maxR, height[r]);
                r--;
            }
        }

        return sum;
    }
}
