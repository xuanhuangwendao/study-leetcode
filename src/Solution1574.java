import java.util.Arrays;

public class Solution1574 {


    // 1,2,3,10,4,2,3,5

    /**
     * 1    3
     * 2    2
     * 3    1
     * 10   1
     * 4    1
     * 2    3
     * 3    2
     * 5    1   7
     * <p>
     * <p>
     * 8
     */

    public int findLengthOfShortestSubarray(int[] arr) {
        int len = arr.length;
        int l = 0;
        int r = arr.length - 1;
        while (l < len - 1 && arr[l] <= arr[l + 1]) {
            l++;
        }
        while (r - 1 >= 0 && arr[r - 1] <= arr[r]) {
            r--;
        }
        if (l >= r) {
            return 0;
        }

        int ret = Math.min(len - l - 1, r);
        for (int i = 0, j = r; i <= l; i++) {
            while (j < len && arr[i] > arr[j]) {
                j++;
            }
            ret = Math.min(ret, j - i - 1);

        }
        return ret;
    }

}
