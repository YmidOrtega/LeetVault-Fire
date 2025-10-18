package N121_BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock{
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyPrice) buyPrice = prices[i];
            else{
                int currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(currentProfit,maxProfit);
            }
        }
        return maxProfit;
    }
}