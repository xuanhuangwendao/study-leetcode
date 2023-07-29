import java.util.*;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        Map<Integer, Map<Integer, Integer>> numMap = new HashMap<>();
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < sortedNums.length; i++) {
            int num1 = sortedNums[i];
            int l = i + 1;
            int r = sortedNums.length - 1;
            while (l < r) {
                int num2 = sortedNums[l];
                int num3 = sortedNums[r];
                int sum = num1 + num2 + num3;
                if (sum == 0) {
                    if (!contain(numMap, num1, num2, num3)) {
                        ret.add(List.of(num1, num2, num3));
                        put(numMap, num1, num2, num3);
                    }
                    r--;
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ret;
    }

    public void put(Map<Integer, Map<Integer, Integer>> map, int num1, int num2, int num3) {
        if (!map.containsKey(num1)) {
            map.put(num1, new HashMap<>());
        }
        map.get(num1).put(num2, num3);
    }
    public boolean contain(Map<Integer, Map<Integer, Integer>> map, int num1, int num2, int num3) {
       return map.containsKey(num1) && map.get(num1).containsKey(num2) && map.get(num1).get(num2).equals(num3);
    }

}
