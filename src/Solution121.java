public class Solution121 {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] suffix = new int[len];
        suffix[len - 1] = prices[len - 1];
        for (int i = len - 2; i > 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], prices[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            max = Math.max(max, suffix[i + 1] - prices[i]);
        }

        return Math.max(max, 0);
    }

}
