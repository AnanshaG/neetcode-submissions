class Solution {
    public int maxProfit(int[] prices) {

        int l = 0;
        int max_profit = 0;
        for(int r = 1; r < prices.length; r++){
            if(prices[r] - prices[l] > 0){
                max_profit = Math.max(max_profit, prices[r] - prices[l]);
            }
            else{
                l = r;
            }
        }
        return max_profit;
        
    }
}

// 10, 1, 5, 6, 7, 1


