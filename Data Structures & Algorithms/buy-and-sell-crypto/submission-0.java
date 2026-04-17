class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min=prices[0];
        for(int i=0; i<prices.length; i++) {
            if(prices[i]<min) {
                min=prices[i];
            } else {
                int todayRate = prices[i]-min;
                if(todayRate>profit) {
                    profit = todayRate;
                }
            }
        }
        return profit;
        // int j=0, max = prices[0], min = prices[0];
        // for(int i=0; i<prices.length; i++) {
        //     if(prices[i]<min) {
        //         min=prices[i];
        //         max=prices[i];
        //         j=i;
        //     }
        //     if(i>j && max<prices[i]) {
        //         max=prices[i];
        //     }
        // }
        // return max-min;
    }
}
