class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int curr = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < curr){
                curr = prices[i];
                continue;
            }
            res = Math.max(res, prices[i] - curr );
        }
        return res;
    }
    
}
