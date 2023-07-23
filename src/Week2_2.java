public class Week2_2 {
    public long maxArrayValue(int[] nums) {
        int max = 0;
        long ret = 0;
        long tmp = 0;
        long last = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            max = Math.max(max, nums[i]);
            long l = nums[i - 1];
            long r = last;
            if (l <= r) {
                tmp = l + r;
                last = tmp;
            } else {
                ret = Math.max(tmp, ret);
                tmp = 0;
                last = nums[i - 1];
            }
        }
        ret = Math.max(tmp, ret);
        if (ret == 0) {
            return Math.max(max, nums[0]);
        }
        return  Math.max(ret, nums[0]);
    }

    public static void main(String[] args) {
        int[] num = new int[1];
        num[0] = 77;
        Week2_2 w = new Week2_2();
        System.out.println(w.maxArrayValue(num));

    }
}
