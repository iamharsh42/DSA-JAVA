// Best time to buy and sell stock : Leetcode easy

public class BuyStocks {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(arr);
        System.out.println(ans);

    }

    static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
