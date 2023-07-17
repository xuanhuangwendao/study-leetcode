public class Solution6929 {

    // 1 1 1 1 3 3 3 3   k=1
    // [ai-k ai+k]
    // a + k
    // a - k
    // num + k


    // 4 6 1 2    - 2
    //

    public int maximumBeauty(int[] nums, int k) {
        final int max = 400005;
        int ret = 0;

        int[] count = new int[max * 2 + 1];

        for (int num : nums) {
            count[Math.min(num + k, max)]++;
        }

        int preSum[] = new int[max * 2 + 1];
        preSum[0] = count[0];
        for (int i = 1; i <= max; i++) {
            if (i - 2 * k - 1 < 0) {
                preSum[i] = preSum[i - 1] + count[i];
            } else {
                preSum[i] = preSum[i - 1] + count[i] - count[i - 2 * k - 1];
            }
            ret = Math.max(preSum[i], ret);
        }

        return ret;

    }

    public static void main(String[] args) {
        int[] n = new int[2];
        n[0] = 1;
        n[1] = 1;
        Solution6929 solution6929 = new Solution6929();
        System.out.println(solution6929.maximumBeauty(n, 0));
    }


}
