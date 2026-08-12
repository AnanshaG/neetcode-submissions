class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Arrays.stream(piles).max().getAsInt();
        int left = 1;
        int right = max;
        int res = max;
        while(left <= right){
            int mid = (left + right)/2;
            int hrs = 0;
            for(int val: piles){
                hrs += (val + mid - 1)/mid;
            }
            System.out.println(hrs + " : " + mid);
            if(hrs > h){
                left = mid+1;
            }
            else if(hrs <= h){
                res = mid;
                right = mid - 1;
            }
            
            

        }

        return res;
        
    }
}
