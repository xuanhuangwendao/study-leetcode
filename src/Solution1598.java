public class Solution1598 {

    public static final String OP_0 = ".";

    public static final String OP_1 = "../";


    public int minOperations(String[] logs) {
        int level = 0;
        for (String log : logs) {
            if (log.startsWith(OP_0)) {
                if (log.equals(OP_1)) {
                    level = Math.max(level - 1, 0);
                }
            } else {
                level++;
            }
        }
        return level;
    }
}
