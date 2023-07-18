import java.util.*;

public class Solution1488 {

    public int[] avoidFlood(int[] rains) {
        int canRemove = 0;

        List<Integer> removeList = new ArrayList<>();
        Set<Integer> dryDays = new HashSet<>();
        Map<Integer, Integer> pool = new HashMap<>();
        Map<Integer, Integer> ops = new HashMap<>();
        for (int day = 0; day < rains.length; day++) {
            int rain = rains[day];
            if (rain == 0) {
                dryDays.add(day);
            } else {
                if (pool.containsKey(rain)) {
                    Integer dryDay = dryDays.stream().filter(i -> i > pool.get(rain)).findFirst().orElse(null);
                    if (dryDay == null) {
                        return new int[0];
                    } else {
                        dryDays.remove(dryDay);
                        ops.put(dryDay, rain);
                    }
                } else {
                    pool.put(rain, day);
                }
            }
        }
        int[] ret = new int[rains.length];
        int k = 1;
        for (int i = 0; i < rains.length; i++) {
            Integer op = ops.get(i);
            if (op == null) {
                ret[i] = k;
                k = -k;
            } else {
                ret[i] = op;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution1488 solution1488 = new Solution1488();
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 0;
        a[3] = 0;
        a[4] = 2;
        a[5] = 1;
        int[] ints = solution1488.avoidFlood(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
