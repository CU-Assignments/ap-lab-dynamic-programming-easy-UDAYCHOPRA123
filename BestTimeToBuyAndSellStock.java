class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        
        int[] dp = new int[n];
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return dp[n - 1]; 
    }
}
