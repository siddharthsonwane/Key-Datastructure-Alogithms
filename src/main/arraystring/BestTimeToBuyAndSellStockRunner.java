package main.arraystring;

public  class BestTimeToBuyAndSellStockRunner {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("MaxProfitBruteForce" + BestTimeToBuyAndSellStockRunner.MaxProfitBruteForce(prices));
        System.out.println("MaxProfitDP" + BestTimeToBuyAndSellStockRunner.MaxProfitDP(prices));
        System.out.println("MaxProfitSinglePass" + BestTimeToBuyAndSellStockRunner.MaxProfitSinglePass(prices));
    }

    private static int MaxProfitSinglePass(int[] prices) {
        int minPrice = prices[0]; // Lowest price seen so far
        int maxProfit = 0;        // Maximum profit found so far

        // Start from day 1 because we already used day 0 as initial minPrice
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];  // Found a better buying day
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;  // Found better profit
                }
            }
        }
        return maxProfit;
    }

    private static int MaxProfitDP(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0];  // Equivalent to minPrice[i]
        int maxProfit = 0;         // Equivalent to maxProfit[i]

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);          // Update min price
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);  // Update max profit
        }
        return maxProfit;
    }

    private static int MaxProfitBruteForce(int[] prices) {
        int maxProfit = 0; // Initialize max profit to 0
        // Check every pair (buy on i, sell on j)
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;  // Update if this profit is greater
                }
            }

        }
        return maxProfit;
    }
}



