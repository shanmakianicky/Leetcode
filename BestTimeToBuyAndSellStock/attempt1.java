package Leetcode.BestTimeToBuyAndSellStock;

public class attempt1 {
    public int brutal(int[] prices){
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++){
                maxProfit = (maxProfit < (prices[j] - prices[i])) ? prices[j] - prices[i] : maxProfit;
            }
        }
        return maxProfit;

    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            maxProfit = (maxProfit < (prices[i] - minPrice)) ? (prices[i] - minPrice) : maxProfit;
        }
        return maxProfit;

    }
}
