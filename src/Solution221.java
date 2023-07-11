class Solution221 {

    /**
     * if ok:
     * dp[i][j] = dp[i-1][j-1] + 1
     * else if 1
     * dp[i][j] = 1
     * else
     * dp[i][j] = 0
     *
     * ok
     * dp[i-1][j-1] = a
     * dp[i-1][j] = b
     * dp[i][j-1] = c
     * ->
     * dp[i][j] = min(a,b,c)
     *
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        int max = 0;

        int dp[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else if (matrix[i - 1][j] == '1' && matrix[i][j - 1] == '1' && matrix[i - 1][j - 1] == '1'){
                        dp[i][j] =Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j])) + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;

    }

}