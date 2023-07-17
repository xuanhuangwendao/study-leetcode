import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution6927 {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int e = -1;
        for (Integer num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
            if (countMap.get(num) > maxCount) {
                maxCount = countMap.get(num);
                e = num;
            }
        }
        final int len = nums.size();
        int[] preCount = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                 preCount[i] = nums.get(i) == e ? 1 : 0;
            } else {
                int has = nums.get(i) == e ? 1 : 0;
                int cc = preCount[i - 1] +  has;
                preCount[i] = cc;
            }

            if (preCount[i] * 2 <= i + 1) {
                continue;
            }
            if ((maxCount - preCount[i]) * 2 <= (len - i - 1)) {
                continue;
            }
            return i;


        }
        return -1;




    }

}
