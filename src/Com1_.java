public class Com1_ {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                ret += nums[i] * nums[i];
            }

        }
        System.out.println(ret);
        return ret;
    }
}
