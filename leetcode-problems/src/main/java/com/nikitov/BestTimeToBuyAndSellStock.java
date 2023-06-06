package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">best-time-to-buy-and-sell-stock</a>
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        var executor = new BestTimeToBuyAndSellStockSolution();
        System.out.println(executor.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));//5
        System.out.println(executor.maxProfit(new int[]{7, 6, 4, 3, 1}));//0
        System.out.println(executor.maxProfit(new int[]{3, 2, 6, 5, 0, 3}));//4
    }
}

class BestTimeToBuyAndSellStockSolution {
    public int maxProfit(int[] prices) {
        int bestMomentToBy = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (bestMomentToBy > prices[i]) {
                bestMomentToBy = prices[i];
            }
            int profit = prices[i] - bestMomentToBy;

            if (bestProfit < profit) {
                bestProfit = profit;
            }
        }
        return bestProfit;
    }
}