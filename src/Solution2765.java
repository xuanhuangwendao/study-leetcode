public class Solution2765 {
    public int alternatingSubarray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                // 3 2 3
                if (i < 3) {
                    dp[i] = 2;
                } else if (nums[i - 1] == nums[i - 2] - 1 && nums[i -2] == nums[i - 3] + 1){
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = 2;
                }
            } else if (nums[i] == nums[i - 1] - 1) {
                if (i < 2) {
                    dp[i] = 0;
                } else if (nums[i - 1] == nums[i - 2] + 1) {
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = 0;
                }
            } else {
                dp[i] = 0;
            }
            max = Math.max(max, dp[i]);
        }
        return max == 0 ? -1 : max;
    }
}
