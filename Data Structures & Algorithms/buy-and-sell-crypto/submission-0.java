class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int mSum = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                mSum = Math.max(prices[i] - min, mSum);
            }


        }

        return mSum;
        
    }
}
