public class Solution477 {


    // 0100
    // 1110
    // 0100
    // 1110
    public int totalHammingDistance(int[] nums) {
        int[] bitNum = new int[33];
        for (int num : nums) {
            int i = 0;
            while (num > 0) {
                bitNum[i] = bitNum[i] +  num % 2;
                num /= 2;
                i++;
            }
        }
        int ret = 0;
        for(int i = 0; i < 33; i++) {
            ret += bitNum[i] * (nums.length - bitNum[i]);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution477 solution477 = new Solution477();
        int[] a = new int[4];
        a[0] = 4;
        a[1] = 14;
        a[2] = 4;
        a[3] = 14;

        int i = solution477.totalHammingDistance(a);
        System.out.println(i);
    }
}
