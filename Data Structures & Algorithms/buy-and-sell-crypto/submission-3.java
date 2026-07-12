class Solution {
    public int maxProfit(int[] prices) {

    int max_p = 0;
    int min_yet = prices[0];

    for(int i = 1; i < prices.length; i++){
        int profit = prices[i] - min_yet;
        if(profit < 0){
            min_yet = prices[i];
        }
        max_p = Math.max(max_p, profit);
    }

    return max_p;
        
    }
}
