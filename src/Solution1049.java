public class Solution1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int n = stones.length;
        int m = sum / 2;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j < stones[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = dp[i][j - stones[i]] || dp[i][j];
                }
            }
        }
        for (int i = m; i >= 0; i--) {
            if (dp[n][i]) {
                return sum - 2 * i;
            }
        }
        return 0;

    }
}
